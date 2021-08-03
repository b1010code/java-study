package com.jrd.study.service;

import java.util.List;

import com.jrd.study.model.Category;

public interface CategoryService {
  public Category save(Category category);
  public List<Category> findAll();
  public Category findById(Long id);
}
