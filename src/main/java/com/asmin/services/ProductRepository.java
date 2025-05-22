package com.asmin.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asmin.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
