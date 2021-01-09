package com.mrhandosme.dsdeliver.dto;

import java.io.Serializable;

import com.mrhandosme.dsdeliver.entities.Product;

public class ProductDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;
	
	ProductDTO(){
		
	}

	public ProductDTO(String id, String name, Double price, String description, String imageUri) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}
	
	public ProductDTO(Product entity) {
	
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		imageUri = entity.getDescription();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
}
