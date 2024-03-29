package com.entor.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.entor.dao.BaseDao;
import com.entor.service.BaseService;

@Repository("baseService")
public class BaseServiceImpl<T> implements BaseService<T>{

	@Resource
	private BaseDao<T> baseDao;
	@Override
	public void add(T t) {
		baseDao.add(t);
	}

	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		baseDao.deleteById(cls, id);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return baseDao.queryById(cls, id);
	}

	@Override
	public int getTotals(Class<?> cls) {
		return baseDao.getTotals(cls);
	}

	@Override
	public List<T> queryByPage(Class<?> cls, int currentPage,int pageSize) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return baseDao.queryByPage(cls, map);
	}

}
