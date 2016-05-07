package com.briup.cms.service.impl;

import com.briup.cms.bean.Student;
import com.briup.cms.dao.StudentDao;
/**
 * 业务逻辑实现类
 * 
 */
import com.briup.cms.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	//关联Dao对象
	private StudentDao studentDao=new StudentDao();
	@Override
	public void add(Student student) {
		studentDao.save(student);
			
		}
}
