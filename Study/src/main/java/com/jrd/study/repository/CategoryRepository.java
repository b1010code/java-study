package com.jrd.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.study.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
