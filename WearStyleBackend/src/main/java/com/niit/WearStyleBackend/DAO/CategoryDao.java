package com.niit.WearStyleBackend.DAO;


import java.util.List;

import com.niit.WearStyleBackend.model.Category;

public interface CategoryDao 
{
	void saveCategory(Category u);
	void updateCategory(Category u);
	void deleteCategory(Category u);
	List<Category> getCategorys();
    Category getCategory(int cid);
}
