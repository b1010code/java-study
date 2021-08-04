package com.jrd.study.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.study.dto.ProductDTO;
import com.jrd.study.model.Product;

public class ProductServiceQueryPageableImpl {
    /*
     * 
	@Transactional(readOnly = true)
	public List<ProductDTO> findQuery(PageRequest pageRequest) {
		List<Product> list = this.repositoryQuery.findAllProductsCategoriesCustom();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

     */
}
