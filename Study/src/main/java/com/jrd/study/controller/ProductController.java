package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.model.Product;
import com.jrd.study.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ResponseEntity<Product> create(@RequestBody Product product) {

		Product createProduct = this.productService.save(product);

		return ResponseEntity.ok(createProduct);
	}

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> product = this.productService.findAll();

		return ResponseEntity.ok(product);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findId(@PathVariable("id") Long id) {
		Product product = this.productService.findById(id);

		return ResponseEntity.ok(product);
	}

}
