package org.jsp.category_product_rest_crud_operations.service;

import java.util.List;
import java.util.Optional;

import org.jsp.category_product_rest_crud_operations.dao.Category_dao;
import org.jsp.category_product_rest_crud_operations.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Category_Service {

	@Autowired
	private Category_dao dao;

	// CRUD operations:-

	// to create/insert/save a record
	public Category saveCategory(Category category) {
		return dao.saveCategory(category);
	}

	// to find a single record by id
	public Optional<Category> findById(int id) {
		return dao.findById(id);
	}

	// to find all records
	public List<Category> findAllById() {
		return dao.findAllById();
	}

	// to update a record
	public Category updateCategory(Category category, int id) {
		dao.findById(id);
		category.setCategory_id(id);
		return dao.updateCategory(category, id);
	}

	// to delete a record by id
	public void deleteById(int id) {
		dao.deleteById(id);
	}
}
