package com.jrd.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jrd.study.model.Product;

public interface ProductRepositoryQueryJPQL extends JpaRepository<Product, Long> {

	@Query("SELECT obj FROM Product obj JOIN FETCH obj.categories")
	public List<Product> findAllProductsCategoriesCustom();

}

// @Query("SELECT obj FROM Product obj JOIN FETCH obj.categories")