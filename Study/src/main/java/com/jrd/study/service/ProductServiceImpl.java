package com.jrd.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.study.model.Product;
import com.jrd.study.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;

	}

	@Override
	public Product save(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
