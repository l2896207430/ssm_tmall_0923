package com.entor.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	
	/**
	 * 新增
	 * @param t
	 */
	public void add(T t);
	
	/**
	 * 根据编号删除
	 * @param cls
	 * @param id
	 */
	public void deleteById(Class<?> cls,Serializable id);
	
	/**
	 * 修改
	 * @param t
	 */
	public void update(T t);
	
	/**
	 * 根据编号查询
	 * @param cls
	 * @param id
	 * @return
	 */
	public T queryById(Class<?> cls,Serializable id);
	
	/**
	 * 查询所有记录数 
	 */
	public int getTotals(Class<?> cls);
	
	/**
	 * 分页查询
	 * @param cls
	 * @param map
	 * @return
	 */
	public List<T> queryByPage(Class<?> cls,int currentPage,int pageSize);
}
