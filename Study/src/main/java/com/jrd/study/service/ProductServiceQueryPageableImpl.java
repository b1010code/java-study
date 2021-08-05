package com.jrd.study.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.study.dto.ProductDTO;
import com.jrd.study.model.Product;
import com.jrd.study.repository.ProductRepositoryQueryPageable;

@Service
public class ProductServiceQueryPageableImpl implements ProductServiceQueryPageable {

	@Autowired
	private ProductRepositoryQueryPageable repositoryQuery;

	public ProductServiceQueryPageableImpl(ProductRepositoryQueryPageable repositoryQuery) {
		this.repositoryQuery = repositoryQuery;
	}

	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findQuery(PageRequest pageRequest) {
		Page<Product> page = this.repositoryQuery.findAll(pageRequest);
		this.repositoryQuery.findAllProductsCategoriesCustom(page.stream().collect(Collectors.toList()));
		return page.map(x -> new ProductDTO(x));
	}

}













