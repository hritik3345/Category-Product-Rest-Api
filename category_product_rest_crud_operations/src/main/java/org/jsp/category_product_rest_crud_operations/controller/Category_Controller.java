package org.jsp.category_product_rest_crud_operations.controller;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.jsp.category_product_rest_crud_operations.dto.Category;
import org.jsp.category_product_rest_crud_operations.service.Category_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

@RestController

public class Category_Controller {

	@Autowired
	private Category_Service service;
	
		// CRUD operations:-
	
		// to create/insert/save a record
	
		@PostMapping("/api/category")
		public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
			Category category2=service.saveCategory(category);
			if(category2==null) {
				return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
			}
			
			return ResponseEntity.ok(category2);
			
		}

		// to find a single record by id
		
		@GetMapping("/api/category/{id}")
		public Category findById(@PathVariable int id) {
			Optional<Category>result=service.findById(id);
			Category category=null;
			if(result.isPresent()) {
				category= result.get();
			}
			else {
				throw new RuntimeException("Did not find category id:"+id);
			}
			return category;
		}

		// to find all records
		
		@GetMapping("/api/category/find")
		public List<Category> findAllById() {
			return service.findAllById();
		}

		// to update a record
		@PutMapping("/api/category")
		public Category updateCategory(@RequestBody Category category) {
			Category category2=service.saveCategory(category);
			return category2;
		}

		// to delete a record by id
		@DeleteMapping("/api/category/{id}")
		public Optional<Category> deleteById(@PathVariable int id) {
			
			Optional<Category> category=service.findById(id);
			if(category==null) {
				throw new RuntimeException("Did not find category id:"+id);
			}
			else {
				service.deleteById(id);
				return category;
			}
			
			
			
		}
}
