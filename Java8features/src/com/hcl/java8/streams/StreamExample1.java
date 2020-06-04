package com.hcl.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(0,40,20,50);
	Stream<Integer> s=list.stream();
	s.forEach(System.out::println);//it will work
	//s.forEach(System.out::println);// it will throw the exception
	
		
	}

}
