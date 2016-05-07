package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

/**
 * 关于栏目信息与交互的类
 * @date 
 * 增删改查，不涉及业务逻辑处理
 * @author Administrator
 *
 */
public class CategoryDao {
	/**
	 * 将Category对象的栏目信息保存到数据库栏目表中
	 * @param 栏目对象
	 */
	public void save(Category category){
		try {
			Connection conn =null;
			PreparedStatement pstmt =null;
			try{
				//获取链接
				conn= ConnectionFactory.getConn();
				String sql="insert into t_category(name,code) value(?,?)";
				//处理sql
				pstmt =conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setString(2, category.getCode());
				//执行sql
				pstmt.executeUpdate();
			}finally{
				if(pstmt!=null){
					pstmt.close();
					if(conn!=null){
						conn.close();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 查询所有的栏目信息
	 * @return 包含栏目信息的集合
	 */
	public List<Category> findAll(){
		return null;
	}

}
