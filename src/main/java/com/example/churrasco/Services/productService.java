package com.example.churrasco.Services;

import java.util.List;

import com.example.churrasco.DTO.ProductsDTO;


public interface productService {

	public ProductsDTO createProduct(ProductsDTO productsDTO);
	
	public List<ProductsDTO> getAllProducts();
	
	public ProductsDTO getProductsById(long id);
	
	public ProductsDTO updateProducts(ProductsDTO productsDTO, long id);
	
	public void deleteProducts(long id); 
	}
