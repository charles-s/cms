package com.briup.cms.service.impl;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;
import com.briup.cms.service.ICategoryService;
/**
 * 业务逻辑实现类
 * @author Administrator
 *
 */
public class CategoryServiceImpl implements ICategoryService {
	//关联dao的对象
	private CategoryDao categoryDao = new CategoryDao();
	/**
	 * 添加栏目
	 */
	@Override
	public void add(Category category) {
		categoryDao.save(category);
	}
}
