package com.example.churrasco.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "products", uniqueConstraints = { @UniqueConstraint(columnNames = {"SKU", "code","name"}) })    //Evita que haya repeticiones en las columnas
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
	private Long id;
	
	@Column(name = "SKU", nullable = false)
    private Long SKU;
	
	@Column(name = "code", nullable = false)
    private Long code;
	
	@Column(name = "name", nullable = false)
    private String name;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "picture")
    private String picture;
	
	@Column(name = "price", nullable = false)
    private float price;
	
	
	@Column(name = "currency")
    private String currency;

	public Products() {
		super();
	}

	public Products(Long id, Long SKU, Long code, String name, String description, String picture, float price,
			String currency) {
		super();
		this.id = id;
		this.SKU = SKU;
		this.code = code;
		this.name = name;
		this.description = description;
		this.picture = picture;
		this.price = price;
		this.currency = currency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSKU() {
		return SKU;
	}

	public void setSKU(Long SKU) {
		this.SKU = SKU;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
