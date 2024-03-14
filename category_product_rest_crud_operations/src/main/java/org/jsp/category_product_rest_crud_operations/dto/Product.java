package org.jsp.category_product_rest_crud_operations.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	//creating properties for Product
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="pId")
	private int product_id;
	@Column(name="name")
	private String product_name;
	@Column(name="price")
	private double product_price;
	
	//implementing many-to-one mapping i.e multiple products can have one category.
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	@JsonBackReference
	private Category category;

	//generating getters and setters for above attributes of product.
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	@JsonIgnore
	public Category getCategory() {
		return category;
	}

	@JsonProperty
	public void setCategory(Category category,int id) {
		this.category = category;
		this.product_id=id;
	}
	
	

	
	
}
