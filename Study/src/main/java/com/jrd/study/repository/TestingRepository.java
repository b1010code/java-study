package com.jrd.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.study.model.PersonTwo;

@Repository
public interface TestingRepository extends JpaRepository<PersonTwo, Long>{

}
