package com.jrd.study.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.jrd.study.dto.ProductDTO;

public interface ProductServiceQueryJPQL {
	public List<ProductDTO> findQuery(PageRequest pageRequest);
	
	//public List<ProductDTO> findQuery(PageRequest pageRequest);
}
