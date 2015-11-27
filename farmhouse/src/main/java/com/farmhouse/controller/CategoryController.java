package com.farmhouse.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farmhouse.beans.CategoryBean;



@RestController
public class CategoryController {

	

	// -------------------Retrieve Categories----------------------
	@RequestMapping(value = "/categories/{type}", method = RequestMethod.GET)
	public ResponseEntity<List<CategoryBean>> listAllBooks(@PathVariable("type") String type) {
		
	
		
		System.out.println("requesting for this type: " + type);
		
		List<CategoryBean> categories = new ArrayList<>();
		
		
		
		if (categories.isEmpty()) {
			return new ResponseEntity<List<CategoryBean>>(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		
	
		return new ResponseEntity<List<CategoryBean>>(categories, HttpStatus.OK);
	}


	
	
	
	
	
	
	

	

}
