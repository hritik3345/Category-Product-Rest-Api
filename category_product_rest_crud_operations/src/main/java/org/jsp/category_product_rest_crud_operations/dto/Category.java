package org.jsp.category_product_rest_crud_operations.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Category {

	// creating properties for category
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cId")
	private int category_id;
	@Column(name = "name")
	private String cName;
	@Column(name = "type")
	private String category_type;
	
	
	
	//implementing one-to-many mapping i.e one category can have multiple products
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	@JsonManagedReference
	private List<Product>product;

	//getters & setters for above attributes of category
	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCategory_type() {
		return category_type;
	}

	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
}
