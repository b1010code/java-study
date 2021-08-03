package com.jrd.study.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jrd.study.model.PersonTwo;

@Service
public class StreamsServiceImpl implements StreamsService {

	@Override // Compare lenan image course
	public List<Integer> arr() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		numbers.stream().filter((l) -> l % 2 == 0) // why dont arrived pair numbers on postman
				.forEach(System.out::println);		          
	  // ou  // .forEach((l) -> System.out.println(l));		

		return numbers;
	}

	
	
// .skip()  .distinct .equals .hashcode   // print count()
	@Override
	public List<Integer> stream1() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		numbers.stream().skip(2).map((n) -> n * 2).forEach((n) -> System.out.println(n));

		return numbers;

	}

	@Override
	public void stream2() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		long count = numbers.stream().filter(n -> n % 2 == 0).count();

		System.out.println(count);

	}

	@Override
	public void stream3() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

		System.out.println(min.get());

	}

	@Override
	public void collect1() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		List<Integer> newNumbers = numbers.stream().filter((n) -> n % 2 == 0).map((n) -> n * 2)
				.collect(Collectors.toList());

		System.out.println(newNumbers);

	}

	@Override
	public void collect2() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		Map<Boolean, List<Integer>> mapa = numbers.stream().map((n) -> n * 3)
				.collect(Collectors.groupingBy((n) -> n % 2 == 0));

		System.out.println(mapa);

	}

	/*
	 * public String threadMeth() { var message = new Thread(() ->
	 * System.out.println("Helow world")).run(); return message;
	 * 
	 * }
	 */

	@Override
	public List<PersonTwo> clientes() {

		var cliente1 = new PersonTwo();
		cliente1.setId(1L);
		cliente1.setName("Douglas Domingos");
		cliente1.setEmail("douglas@gmail.com");

		var cliente2 = new PersonTwo();
		cliente2.setId(2L);
		cliente2.setName("Gilberto Domingos");
		cliente2.setEmail("domingos@hotmail.com");

		return Arrays.asList(cliente1, cliente2);

	}

}
