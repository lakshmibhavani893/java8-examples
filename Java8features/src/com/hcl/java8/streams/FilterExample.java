package com.hcl.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {
	

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(0,40,20,50);
	Stream<Integer> s=list.stream().filter(l->l.intValue()>40);
	s.forEach(System.out::println);

	
		
	}


}
