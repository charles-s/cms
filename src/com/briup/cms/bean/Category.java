package com.briup.cms.bean;

public class Category {
	/**
	 * 栏目类javaBean
	 * 存储栏目信息
	 */
	
	private Long id;
	private String name;
	private String code;
	//构造函数.. 有参无参
	public Category(){
		
	}
	public Category(Long id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	//3 set get...
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	

}
