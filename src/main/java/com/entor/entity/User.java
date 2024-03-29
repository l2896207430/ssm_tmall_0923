package com.entor.entity;

/**
 * 用户表
 * @author Administrator
 *
 */
public class User {
	
	
	/**
	 * 用户编号
	 */
	private int id;
	
	/**
	 * 用户帐号
	 */
	private String name;
	
	/**
	 * 用户密码
	 */
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
