package com.jrd.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.study.model.Person;

@Repository
public interface PersonFilterRepository extends JpaRepository<Person, Long>{

}
