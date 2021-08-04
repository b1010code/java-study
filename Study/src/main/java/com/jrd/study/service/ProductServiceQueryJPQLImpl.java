package com.jrd.study.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.study.dto.ProductDTO;
import com.jrd.study.model.Product;
import com.jrd.study.repository.ProductRepositoryQueryJPQL;

@Service
public class ProductServiceQueryJPQLImpl implements ProductServiceQueryJPQL {

	@Autowired
	private ProductRepositoryQueryJPQL repositoryQuery;

	public ProductServiceQueryJPQLImpl(ProductRepositoryQueryJPQL repositoryQuery) {
		this.repositoryQuery = repositoryQuery;
	}

	
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findQuery() {
		List<Product> list = this.repositoryQuery.findAllProductsCategoriesCustom();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	

}
