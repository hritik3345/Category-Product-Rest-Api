package org.jsp.category_product_rest_crud_operations.repository;

import org.jsp.category_product_rest_crud_operations.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product, Integer> {

	//Created Product_Repository interface which extends JpaRepository 
	//to perform all crud operations by providing inbuilt methods.
}
