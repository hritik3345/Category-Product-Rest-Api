package org.jsp.category_product_rest_crud_operations.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.category_product_rest_crud_operations.dto.Category;
import org.jsp.category_product_rest_crud_operations.repository.Category_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Category_dao {

	@Autowired
	Category_Repository repository;
	
	//CRUD operations:-
	
	//to create/insert/save a record
	public Category saveCategory(Category category) {
		return repository.save(category);
	}
	
	// to find a single record by id
	public Optional<Category> findById(int id) {
		return repository.findById(id);
	}
	
	// to find all records 
	public List<Category> findAllById() {
		return repository.findAll();
	}
	
	// to update a record
	public Category updateCategory(Category category,int id) {
		repository.findById(id);
		category.setCategory_id(id);
		return repository.save(category);
	}
		
	// to delete a record by id
	public void deleteById(int id) {
		repository.deleteById(id);
	}
		
}
