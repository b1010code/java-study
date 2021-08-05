package com.jrd.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jrd.study.model.Product;

@Repository
public interface ProductRepositoryQueryJPQL extends JpaRepository<Product, Long> {

	@Query("SELECT obj FROM Product obj JOIN FETCH obj.categories")
	public List<Product> findAllProductsCategoriesCustom();

}
