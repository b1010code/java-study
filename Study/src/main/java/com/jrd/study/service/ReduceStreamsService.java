package com.jrd.study.service;

import java.util.Optional;

public interface ReduceStreamsService {
	public Optional<String> reduceString();
	public Optional<Integer> reduceMultiply();
	public Optional<Integer> reduceSum();
}
