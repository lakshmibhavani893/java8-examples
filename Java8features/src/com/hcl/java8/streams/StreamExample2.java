package com.hcl.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		example1();
		example3();
		example4();
		example5();
		example6();
	}

	static void example1() {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(5);
		myList.add(8);
		Stream<Integer> myStream = myList.stream();
		myStream.forEach(e -> System.out.println(e));
	}

	static void example3() {
		String[] myArray = new String[] { "bob", "alice", "paul", "ellie" };
		Stream<String> myStream = Arrays.stream(myArray);

		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());

		String[] myNewArray = myNewStream.toArray(String[]::new);
		for (String s : myNewArray)
			System.out.println(s);
	}

	static void example4() {
		String[] myArray = new String[] { "bob", "alice", "paul", "ellier" };

		String[] myNewArray = Arrays.stream(myArray).filter(s -> s.length() > 4&&s.length()<6).toArray(String[]::new);
		for (String s : myNewArray)
			System.out.println(s);
	}

	static void example5() {
		int myArray[] = { 1, 5, 8 };
		int sum = Arrays.stream(myArray).sum();
		System.out.println(sum);
	}

	static void example6() {
		String[] myArray = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray).reduce("", (a, b) -> a + b);
		System.out.println(result);
	}
}
