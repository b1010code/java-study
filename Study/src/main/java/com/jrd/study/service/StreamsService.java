package com.jrd.study.service;

import java.util.List;

import com.jrd.study.model.PersonTwo;

public interface StreamsService {

	public List<Integer> arr();

	// public String threadMeth();
	
	public List<Integer> stream1();

	public void stream2();

	public void stream3();

	public void collect1();

	public void collect2();

	public List<PersonTwo> clientes();
}
