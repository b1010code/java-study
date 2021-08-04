package com.jrd.study.controller;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jrd.study.dto.ProductDTO;

public class ProductControllerQueryPageable {
   /*
    * @GetMapping("query")
	public ResponseEntity<List<ProductDTO>> getQuery(
			
			
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "10") Integer size
			){
		
		PageRequest pageRequest = PageRequest.of(page, size);
		List<ProductDTO>list = this.serviceQuery.findQuery(pageRequest);		
		
		return ResponseEntity.ok(list);
	}
	
    */
}
