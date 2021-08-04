package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.dto.ProductDTO;
import com.jrd.study.service.ProductServiceQueryJPQL;

@RestController
@RequestMapping("/jpql")
public class ProductControllerQueryJPQL {
   
	@Autowired
	private ProductServiceQueryJPQL serviceQuery;

	public ProductControllerQueryJPQL(ProductServiceQueryJPQL serviceQuery) {
		this.serviceQuery = serviceQuery;
	}
	
	
	@GetMapping("query")
	public ResponseEntity<List<ProductDTO>> getQuery(
			
			
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "10") Integer size
			){
		
		PageRequest pageRequest = PageRequest.of(page, size);
		List<ProductDTO>list = this.serviceQuery.findQuery(pageRequest);		
		
		return ResponseEntity.ok(list);
	}
	
	
}
