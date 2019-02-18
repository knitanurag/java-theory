package com.anurag.jth.java8.stream;

import java.util.stream.IntStream;

public class IntStreamExample {
	public static void main(String[] args) {

		getCubeOfInetegers();

	}

	private static void getCubeOfInetegers() {
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6);
		stream.mapToObj(num -> (num * num * num)).forEach(System.out::println);

	}
}
