package com.jrd.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.study.model.Car;

@Repository
public interface MethodsParametersRepository extends JpaRepository<Car, Long> {

}
