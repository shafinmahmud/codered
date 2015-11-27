package com.farmhouse.beans;

import java.util.ArrayList;

public class SubCateogryBean {

	private String name;
	private ArrayList<String> crops;

	public SubCateogryBean() {
	}

	public SubCateogryBean(String name, ArrayList<String> crops) {

		this.name = name;
		this.crops = crops;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getCrops() {
		return crops;
	}

	public void setCrops(ArrayList<String> cropList) {
		this.crops = cropList;
	}

	@Override
	public String toString() {
		return String.format("SubCateogryBean [name=%s, crops=%s]", name, crops);
	}
}
