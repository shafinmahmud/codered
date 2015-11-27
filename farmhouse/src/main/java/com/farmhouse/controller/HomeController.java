package com.farmhouse.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmhouse.beans.CategoryBean;
import com.farmhouse.beans.NavigationBean;
import com.farmhouse.entity.Category;
import com.farmhouse.entity.SubCategory;
import com.farmhouse.service.CategoryService;

@Controller
public class HomeController {
	@Autowired
	CategoryService CategoryService;

	@RequestMapping("/")
	public String home(Model model) {

		List<Category> categories = CategoryService.getCategoryList();

		List<SubCategory> fosol = null;
		List<SubCategory> folmul = null;
		List<SubCategory> sobji = null;

		if (categories != null) {

			for (Category category : categories) {

				if (category.getCategoryName().equals("")) {
					
					fosol = (List<SubCategory>) category.getSubCategoryCollection();

				}
				else if (category.getCategoryName().equals("")) {
					folmul = (List<SubCategory>) category.getSubCategoryCollection();
				}
				else if (category.getCategoryName().equals("")) {
					sobji = (List<SubCategory>) category.getSubCategoryCollection();
				}
			}

		}
		model.addAttribute("fosol", fosol);
		model.addAttribute("folmul", folmul);
		model.addAttribute("sobji", sobji);
		return "home";
	}
}
