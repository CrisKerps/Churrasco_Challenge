package com.example.churrasco.DTO;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductsDTO {

	private Long id;
	
	@NotNull(message= "SKU cannot be empty or null")
	@Max(value = 999999999, message = "SKU number max lenght is 999999999")
    private Long SKU;

	@NotNull(message= "Code cannot be empty or null")
	@Max(value = 999999999, message = "Code number max lenght is 999999999")
    private Long code;

	@NotNull(message= "Name cannot be empty or null")
	@Size(min = 3, message = "The name cannot be lower than 3 words")
	private String name;
    
	
	private String description;
    
	
	private String picture;
    
	
	@NotNull(message= "Price cannot be empty or null")
	@DecimalMin(value = "0.01")
	private float price;
	

	private String currency;
	
    
    public ProductsDTO() {
		super();
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


	public void setSKU(Long sKU) {
		SKU = sKU;
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
