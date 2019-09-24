package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.service.CategoryService;

@Controller
public class CategoryController {

	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("/admin_category_list/{currentPage}")
	public String list(@PathVariable String currentPage, Map<String, Object> map) {
		int sp = 1;
		int pageSize = 5;
		int totals = categoryService.getTotals(Category.class);
		int pageCounts = totals/pageSize;
		if(totals%pageSize!=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		}catch(Exception e) {
			sp = 1;
		}
		if(sp>pageCounts) {
			sp = pageCounts;
		}
		if(sp<1) {
			sp = 1;
		}
		List<Category> list = categoryService.queryByPage(Category.class, sp, pageSize);
		map.put("totals", totals);
		map.put("sp", sp);
		map.put("pageCounts", pageCounts);
		map.put("list", list);
		
		return "admin/listCategory";
	}
	
	@RequestMapping("/admin_category_delete/{cid}/{currentPage}")
	public String deleteById(@PathVariable int cid,@PathVariable String currentPage) {
		categoryService.deleteById(Category.class, cid);
		System.out.println("删除编号:"+cid+"成功");
		return "redirect:admin_category_list/"+currentPage;
	}
	
	@RequestMapping("/admin_category_add/{currentPage}")
	public String add(Category category,@PathVariable String currentPage) {
		categoryService.add(category);
		System.out.println("新增成功");
		return "redirect:admin_category_list/"+currentPage;
	}
	
	@RequestMapping("/admin_category_edit/{cid}")
	public String update(@PathVariable int cid,Map<String, Object> map) {
		Category category = categoryService.queryById(Category.class, cid);
		map.put("c", category);
		return "admin/editCategory";
	}
}
