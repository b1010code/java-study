package com.jrd.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrd.study.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
