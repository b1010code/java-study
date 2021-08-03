package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.converter.ProductConverter;
import com.jrd.study.dto.ProductDto;
import com.jrd.study.model.Product;
import com.jrd.study.repository.ProductRepository;

@RestController
@RequestMapping("/dtos")
public class ProductDtoController {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductConverter converter;

	public ProductDtoController(ProductRepository productRepository, ProductConverter converter) {
		this.productRepository = productRepository;
		this.converter = converter;
	}

	@GetMapping("/dtoByAll")
	@ResponseBody
	public List<ProductDto> findDto() {
		List<Product> findAll = this.productRepository.findAll();
		return this.converter.entityToDto(findAll);
	}

	@GetMapping("/byId/{id}")
	public ProductDto findById(@PathVariable(value = "id") Long id) {
		Product orElse = this.productRepository.findById(id).orElse(null);
		return this.converter.entityToDto(orElse);

	}

	@PostMapping("/save")
	public ProductDto save(@RequestBody ProductDto dto) {

		Product student = this.converter.dtoToEntity(dto);
		student = this.productRepository.save(student);
		return this.converter.entityToDto(student);
	}
}
