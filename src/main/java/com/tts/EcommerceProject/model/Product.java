package com.tts.EcommerceProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int quantity;
	private int price;
	private String description;
	private String name;
	private String brand;
	private String category;
	private String imageURL;


	public Product() {
	}
	
	public long getId() {
		return this.id;
	}

	public Product(int quantity, int price, String description, String name, String brand, String category,
			String imageURL) {
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.imageURL = imageURL;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", quantity='" + getQuantity() + "'" +
			", price='" + getPrice() + "'" +
			", description='" + getDescription() + "'" +
			", name='" + getName() + "'" +
			", brand='" + getBrand() + "'" +
			", category='" + getCategory() + "'" +
			", imageURL='" + getImageURL() + "'" +
			"}";
	}



}