package com.jrd.study.service;

import java.util.List;

import com.jrd.study.model.Person;

public interface PersonFilterService {

	public Person save(Person person);

	public List<Person> findAll();

	public List<Person> findLetter();
}
