package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.dto.ProductDTO;
import com.jrd.study.service.ProductServiceQueryPageable;

@RestController
@RequestMapping("/pageable")
public class ProductControllerQueryPageable {

	@Autowired
	private ProductServiceQueryPageable serviceQuery;

	public ProductControllerQueryPageable(ProductServiceQueryPageable serviceQuery) {
		this.serviceQuery = serviceQuery;
	}

	@GetMapping("query")
	public ResponseEntity<Page<ProductDTO>> getQuery(

			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "10") Integer size) {

		PageRequest pageRequest = PageRequest.of(page, size);
		Page<ProductDTO> list = this.serviceQuery.findQuery(pageRequest);

		return ResponseEntity.ok(list);
	}

}
