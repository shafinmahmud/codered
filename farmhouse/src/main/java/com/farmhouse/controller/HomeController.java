package com.farmhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmhouse.dao.SubCategoryDao;
import com.farmhouse.entity.Category;
import com.farmhouse.entity.SubCategory;
import com.farmhouse.service.CategoryService;

@Controller
public class HomeController {

	
	
		
	@Autowired
	CategoryService CategoryService;
	
	@Autowired
	SubCategoryDao subCategoryDao;

	@RequestMapping("/")
	public String home(Model model) {

		List<Category> categories = null;
		List<SubCategory> subcategories = null;
		
		categories = CategoryService.getCategoryList();
	    subcategories= subCategoryDao.findAll();

		model.addAttribute("categories", categories);
		model.addAttribute("subcategories", subcategories);
		
		
		return "home";

	}
}
