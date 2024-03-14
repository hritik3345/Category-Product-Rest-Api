package org.jsp.category_product_rest_crud_operations.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.category_product_rest_crud_operations.dto.Category;
import org.jsp.category_product_rest_crud_operations.dto.Product;
import org.jsp.category_product_rest_crud_operations.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Product_Controller {

	@Autowired
	private Product_Service service;

	// CRUD operations:-

	// to create/insert/save a record

	@PostMapping("/api/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product product2=service.saveProduct(product);
		if(product2==null) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}
		
		return ResponseEntity.ok(product2);
		
	}
	

	// to find a single record by id
	@GetMapping("/api/product/{id}")
	public Optional<Product> findById(@PathVariable int id) {
		return service.findById(id);
	}

	// to find all records
	@GetMapping("/api/product")
	public List<Product> findById() {
		return service.findById();
	}

	// to update a record
	@PutMapping("/api/product/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable int id) {
		service.findById(id);
		product.setProduct_id(id);
		return service.updateProduct(product, id);
	}

	// to delete a record by id
	@DeleteMapping("/api/product/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}
}
