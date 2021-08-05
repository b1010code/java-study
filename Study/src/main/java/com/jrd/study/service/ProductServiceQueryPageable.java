package com.jrd.study.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.jrd.study.dto.ProductDTO;

public interface ProductServiceQueryPageable {
	public Page<ProductDTO> findQuery(PageRequest pageRequest);
}
