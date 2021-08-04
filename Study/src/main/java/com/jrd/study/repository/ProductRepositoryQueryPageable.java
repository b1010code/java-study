package com.jrd.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.jrd.study.model.Product;

public interface ProductRepositoryQueryPageable {
  /*
   * @Query("SELECT obj FROM Product obj JOIN FETCH obj.categories")
	public List<Product> findAllProductsCategoriesCustom();
   */
}
