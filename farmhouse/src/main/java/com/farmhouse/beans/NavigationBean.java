package com.farmhouse.beans;

import java.util.List;

public class NavigationBean {
	
	private List<CategoryBean> cateogires;

	
	public NavigationBean() {
	}

	public NavigationBean(List<CategoryBean> cateogires) {
		this.cateogires = cateogires;
	}

	public List<CategoryBean> getCateogires() {
		return cateogires;
	}

	public void setCateogires(List<CategoryBean> cateogires) {
		this.cateogires = cateogires;
	}

	@Override
	public String toString() {
		return String.format("NavigationBean [cateogires=%s]", cateogires);
	}
	
	
}

