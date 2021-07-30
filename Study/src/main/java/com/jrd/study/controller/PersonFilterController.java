package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Person postPerson(@RequestBody Person person) {
		return this.personService.save(person);
	}
	
	@GetMapping
	@ResponseBody
	public List<Person> getAll(){
		return this.personService.findAll();
	}
	
	
	@GetMapping("/letter")
	@ResponseBody
	public List<Person>getLetter(){
		return this.personService.findLetter();
	}
	

}
