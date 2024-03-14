package org.jsp.category_product_rest_crud_operations.repository;

import org.jsp.category_product_rest_crud_operations.dto.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Category_Repository extends JpaRepository<Category, Integer> {

	//Created Category_Repository interface which extends JpaRepository 
	//to perform all crud operations by providing  inbuilt methods.
}
