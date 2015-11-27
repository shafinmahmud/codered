package com.farmhouse.beans;

import java.util.List;

public class CategoryBean {
	
	private String name;

	private List<SubCateogryBean> subCategories;

	
	public CategoryBean() {
	}

	public CategoryBean(String name, List<SubCateogryBean> subCategories) {
		super();
		this.name = name;
		this.subCategories = subCategories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubCateogryBean> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCateogryBean> subCategories) {
		this.subCategories = subCategories;
	}
	

}
