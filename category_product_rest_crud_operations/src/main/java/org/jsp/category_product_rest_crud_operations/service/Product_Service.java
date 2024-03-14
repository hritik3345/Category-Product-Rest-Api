package org.jsp.category_product_rest_crud_operations.service;

import java.util.List;
import java.util.Optional;

import org.jsp.category_product_rest_crud_operations.dao.Product_dao;
import org.jsp.category_product_rest_crud_operations.dto.Product;
import org.jsp.category_product_rest_crud_operations.repository.Product_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_Service {

	@Autowired
	private Product_dao dao;

	// CRUD operations:-

	// to create/insert/save a record
	public Product saveProduct(Product product) {
		return dao.saveProduct(product);
	}

	// to find a single record by id
	public Optional<Product> findById(int id) {
		return dao.findById(id);
	}

	// to find all records
	public List<Product> findById() {
		return dao.findById();
	}

	// to update a record
	public Product updateProduct(Product product, int id) {
		dao.findById(id);
		product.setProduct_id(id);
		return dao.updateProduct(product, id);
	}

	// to delete a record by id
	public void deleteById(int id) {
		dao.deleteById(id);
	}
}
