package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.briup.cms.bean.Student;
import com.briup.cms.common.ConnectionFactory;

public class StudentDao {
	public void save(Student student) {
		try {

			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				// 获取链接
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_student(name,age,sex) value(?,?,?)";
				// 处理sql
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, student.getName());
				pstmt.setInt(2, student.getAge());
				pstmt.setString(3, student.getSex());
				// 执行sql
				pstmt.executeUpdate();
			} finally {
				/**
				 * pstmt先释放 conn后释放
				 */
				if (pstmt != null) {
					pstmt.close();
					if (conn != null) {
						conn.close();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
