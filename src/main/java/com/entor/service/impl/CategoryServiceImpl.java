package com.entor.service.impl;

import org.springframework.stereotype.Repository;

import com.entor.entity.Category;
import com.entor.service.CategoryService;

@Repository("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService{

}
