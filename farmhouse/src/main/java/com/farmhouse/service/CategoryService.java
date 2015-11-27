package com.farmhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmhouse.dao.CategoryDao;
import com.farmhouse.dao.SubCategoryDao;
import com.farmhouse.entity.Category;

@Service("categoryService")
public class CategoryService {

	@Autowired
	CategoryDao categoryDao;

	@Autowired
	SubCategoryDao subCategoryDao;
	
	public List<Category> getCategoryList(){
		
		return categoryDao.findAll();
		
	}

	/*public NavigationBean getNavigations() {
		NavigationBean navigationBean = new NavigationBean();

		List<CategoryBean> categoryBeanList = new ArrayList<>();
		Iterator<Category> categories = categoryDao.findAll().iterator();
		while (categories.hasNext()) {

			Category category = categories.next();
			CategoryBean categoryBean = new CategoryBean();
			categoryBean.setName(category.getCategoryName());

			Iterator<SubCategory> subCategories = category.getSubCategoryCollection().iterator();
			ArrayList<SubCateogryBean> subCategoryList = new ArrayList<>();
			while (subCategories.hasNext()) {

				SubCategory subCategory = subCategories.next();
				SubCateogryBean subCateogryBean = new SubCateogryBean();
				subCateogryBean.setName(subCategory.getSubCategoryName());

				Iterator<Crop> crops = subCategories.next().getCropCollection().iterator();
				ArrayList<String> cropList = new ArrayList<>();
				while (crops.hasNext()) {

					String cropName = crops.next().getCropName();
					cropList.add(cropName);
				}
				subCateogryBean.setCrops(cropList);
			}
			categoryBean.setSubCategories(subCategoryList);
			categoryBeanList.add(categoryBean);
		}
		navigationBean.setCateogires(categoryBeanList);
		return navigationBean;
	}*/
}
