package com.entor.entity;

/**
 * 分类管理
 * @author Administrator
 *
 */
public class Category {
	
	/**
	 * 分类编号
	 */
	private int id;
	
	/**
	 * 分类名称
	 */
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
