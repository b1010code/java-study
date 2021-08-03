package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.model.Category;
import com.jrd.study.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category category) {
		Category create = this.categoryService.save(category);

		return ResponseEntity.ok(create);
	}

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = this.categoryService.findAll();

		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Category> findId(@PathVariable("id") Long id) {
		Category byId = this.categoryService.findById(id);

		return ResponseEntity.ok(byId);
	}

}
