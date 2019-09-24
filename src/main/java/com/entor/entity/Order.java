package com.entor.entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 订单管理
 * @author Administrator
 *
 */
public class Order {

	/**
	 * 订单编号
	 */
	private int id;
	
	/**
	 * 订单号
	 */
	private Date orderCode;
	
	/**
	 * 订单地址
	 */
	private String address;
	
	/**
	 * 用户邮编
	 */
	private String post; 
	
	/**
	 * 收货人姓名
	 */
	private String receiver;
	
	/**
	 * 收货人电话
	 */
	private String mobile;
	
	/**
	 * 客户备注
	 */
	private String userMessage;
	
	/**
	 * 发货时间
	 */
	private Timestamp createDate;
	
	/**
	 * 确认收货时间
	 */
	private Timestamp payDate;
	
	/**
	 * 用户编号
	 */
	private int uid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Date orderCode) {
		this.orderCode = orderCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getPayDate() {
		return payDate;
	}

	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderCode=" + orderCode + ", address=" + address + ", post=" + post
				+ ", receiver=" + receiver + ", mobile=" + mobile + ", userMessage=" + userMessage + ", createDate="
				+ createDate + ", payDate=" + payDate + ", uid=" + uid + "]";
	}
}
