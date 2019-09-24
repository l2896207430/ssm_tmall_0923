package com.entor.entity;

/**
 * 分类属性
 * @author Administrator
 *
 */
public class Property {
	
	/**
	 * 分类属性编号
	 */
	private int id;
	
	/**
	 * 分类管理编号
	 */
	private int cid;
    
	/**
	 * 属性名称
	 */
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", cid=" + cid + ", name=" + name + "]";
	}
}
