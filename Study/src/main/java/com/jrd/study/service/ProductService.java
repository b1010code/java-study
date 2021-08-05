package com.jrd.study.service;

import java.util.List;

import com.jrd.study.model.Product;

public interface ProductService {
	public Product save(Product product);
	public List<Product>findAll();
	public Product findById(Long id);	
	
}
