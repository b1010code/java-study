package com.jrd.study.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.study.model.Person;
import com.jrd.study.repository.PersonFilterRepository;

@Service
public class PersonFilterServiceImpl implements PersonFilterService {

	@Autowired
	private PersonFilterRepository personRepository;

	public PersonFilterServiceImpl(PersonFilterRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person save(Person person) {
		return this.personRepository.save(person);
	}

	@Override
	public List<Person> findAll() {
		return this.personRepository.findAll();
	}

	@Override
	public List<Person> findLetter() {
		return this.personRepository.findAll().stream()
				.filter(person -> person.getName().startsWith("Dilara"))						
				        .collect(Collectors.toList());
		
		
	}

}
