package com.example.churrasco.Controllers;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.churrasco.DTO.ProductsDTO;
import com.example.churrasco.Services.productService;

@RestController
@RequestMapping("api/products")
public class productController {

	@Autowired
	private productService productService;
	
	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping
	public List<ProductsDTO> listProducts(){
		return productService.getAllProducts();
		}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{id}")
	public ResponseEntity<ProductsDTO> getProductsById(@PathVariable(name = "id") long id){
		return ResponseEntity.ok(productService.getProductsById(id));
	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	public ResponseEntity<ProductsDTO> saveProducts(@Validated @RequestBody ProductsDTO productsDTO){
		return new ResponseEntity<>(productService.createProduct(productsDTO), HttpStatus.CREATED);
	}
	
	//@PutMapping("/{id}")
	//public ResponseEntity<ProductsDTO> updateProducts(@RequestBody ProductsDTO productsDTO, @PathVariable(name = "id") long id){
		//ProductsDTO productsResponse = productService.updateProducts(productsDTO, id);
		//return new ResponseEntity<>(productsResponse, HttpStatus.OK);
	//}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProducts(@PathVariable(name = "id") long id){
		productService.deleteProducts(id);
		return new ResponseEntity<>("Successfully Erased", HttpStatus.OK);
	}
	
}


