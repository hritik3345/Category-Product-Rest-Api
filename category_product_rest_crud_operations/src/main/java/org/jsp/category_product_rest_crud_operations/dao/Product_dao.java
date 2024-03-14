package org.jsp.category_product_rest_crud_operations.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.category_product_rest_crud_operations.dto.Product;
import org.jsp.category_product_rest_crud_operations.repository.Product_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Product_dao {

	@Autowired
	Product_Repository repository;
	
	// CRUD operations:-

	// to create/insert/save a record
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	// to find a single record by id
	public Optional<Product> findById(int id) {
		return repository.findById(id);
	}

	// to find all records
	public List<Product> findById() {
		return repository.findAll();
	}

	// to update a record
	public Product updateProduct(Product product, int id) {
		repository.findById(id);
		product.setProduct_id(id);
		return repository.save(product);
	}

	// to delete a record by id
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
