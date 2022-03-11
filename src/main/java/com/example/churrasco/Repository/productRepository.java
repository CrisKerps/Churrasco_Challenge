package com.example.churrasco.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.churrasco.Models.Products;


public interface productRepository extends JpaRepository <Products, Long>{
}
