package com.winterbe.java8.samples.stream;

import java.util.Arrays;

import org.junit.Test;

public class Streams9 {
	@Test
	public void test0() {
		Arrays.asList("apple", "ant", "banana", "pear", "cat", "dog")
		.stream().filter(x -> (x.length() > 3))
		.map(x -> x.toUpperCase()).sorted().forEach(System.out::println);
	}
	
	@Test
	public void test1() {
		Arrays.asList("a1", "a2", "b1", "c2", "c1")
		.stream()
		.filter(s -> s.startsWith("c"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
	}
}
