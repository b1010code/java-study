package com.jrd.study.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
// reduce objetivo transformar monte de elemento em um só, operação varia tipo
// na soma - resultado da soma vira o n1 e depois vai somando
// subtração não fazer não é assciativa

@Service
public class ReduceStreamsServiceImpl implements ReduceStreamsService {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
	
	String fhrase = "will concatenate , it will put everything together";
	String[] splitfhrase = fhrase.split(" ");
	List<String> strList = Arrays.asList(splitfhrase);

	public Optional<String> reduceString() {
		Optional<String> concat = strList.stream().reduce((s1, s2) -> s1.concat(s2));
		
		return concat;
	}

	public Optional<Integer> reduceMultiply() {
		Optional<Integer> multiply = list.stream().reduce((n1, n2) -> n1 * n2);
		
		return multiply;
	}

	public Optional<Integer> reduceSum() {
		Optional<Integer> sum = list.stream().reduce((n1, n2) -> n1 + n2);
		
		return sum;
	}

	

}
