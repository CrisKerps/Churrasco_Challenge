package com.example.churrasco.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.churrasco.DTO.ProductsDTO;
import com.example.churrasco.Exceptions.ResourceNotFoundException;
import com.example.churrasco.Models.Products;
import com.example.churrasco.Repository.productRepository;

@Service
public class productServiceImpl implements productService {

	@Autowired
	private productRepository productRepository;

	@Override
	public ProductsDTO createProduct(ProductsDTO productsDTO) {
		Products products = mapEntity(productsDTO);
		Products newProducts = productRepository.save(products);
		ProductsDTO productsResponse = mapDTO(newProducts);
		return productsResponse;
	}

	@Override
	public List<ProductsDTO> getAllProducts() {
		List<Products> products = productRepository.findAll();
		return products.stream().map(product -> mapDTO(product)).collect(Collectors.toList());
	}

	// Metodo que convierte Entidad a DTO

	private ProductsDTO mapDTO(Products products) {
		ProductsDTO productsDTO = new ProductsDTO();
		productsDTO.setId(products.getId());
		productsDTO.setSKU(products.getSKU());
		productsDTO.setCode(products.getCode());
		productsDTO.setName(products.getName());
		productsDTO.setDescription(products.getDescription());
		productsDTO.setPicture(products.getPicture());
		productsDTO.setPrice(products.getPrice());
		productsDTO.setCurrency(products.getCurrency());
		return productsDTO;
	}

	// Metodo que convierte DTO a Entidad

	private Products mapEntity(ProductsDTO productsDTO) {
		Products products = new Products();
		products.setId(productsDTO.getId());
		products.setSKU(productsDTO.getSKU());
		products.setCode(productsDTO.getCode());
		products.setName(productsDTO.getName());
		products.setDescription(productsDTO.getDescription());
		products.setPicture(productsDTO.getPicture());
		products.setPrice(productsDTO.getPrice());
		products.setCurrency(productsDTO.getCurrency());
		return products;
	}

	@Override
	public ProductsDTO getProductsById(long id) {
		Products products = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Products", "id", id));
		return mapDTO(products);
	}

	@Override
	public ProductsDTO updateProducts(ProductsDTO productsDTO, long id) {
		Products products = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Products", "id", id));
		products.setId(productsDTO.getId());
		products.setSKU(productsDTO.getSKU());
		products.setCode(productsDTO.getCode());
		products.setName(productsDTO.getName());
		products.setDescription(productsDTO.getDescription());
		products.setPicture(productsDTO.getPicture());
		products.setPrice(productsDTO.getPrice());
		products.setCurrency(productsDTO.getCurrency());
	
		Products updateProducts = productRepository.save(products);
		
		return mapDTO(updateProducts);
	}

	@Override
	public void deleteProducts(long id) {
		Products products = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Products", "id", id));
		productRepository.delete(products);
				
	}

}
