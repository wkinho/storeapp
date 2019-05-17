package com.store.storeapp.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long productId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "product")
	private Set<ProductOrder> productOrder;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_TYPE_FK")
	private ProductType productType;
	
	@NonNull
	@Column(length=30)
	private String name;
	
	@NonNull
	@Column(length=30)
	private String brand;
	
	@NonNull
	private Float price;
	
	private String description;
	
	//construct
	public Product() {}

	public Product(long productId, Set<ProductOrder> productOrder, ProductType productType,
			String name, String brand, Float price, String description) {
		super();
		this.productId = productId;
		this.productOrder = productOrder;
		this.productType = productType;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.description = description;
	}




	public Set<ProductOrder> getProductOrder() {
		return productOrder;
	}


	public void setProductOrder(Set<ProductOrder> productOrder) {
		this.productOrder = productOrder;
	}


	public Product(long productId) {
		super();
		this.productId = productId;
	}

	//getters and setters
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}

	@JsonIgnore
	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
