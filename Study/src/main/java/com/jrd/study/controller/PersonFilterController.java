package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jrd.study.model.Person;
import com.jrd.study.service.PersonFilterService;

@Controller
@RequestMapping("/persons")
public class PersonFilterController {
	
	@Autowired
	private PersonFilterService personService;

	public PersonFilterController(PersonFilterService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Person>  postPerson(@RequestBody Person person) {
		Person pers =  this.personService.save(person);
		
		return ResponseEntity.ok(pers);
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Person>>  getAll(){
		List<Person> list = this.personService.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping("/letter")
	@ResponseBody
	public ResponseEntity<List<Person>> getLetter(){
		List<Person> list = this.personService.findLetter();
		
		return ResponseEntity.ok(list);
	}
	

}
