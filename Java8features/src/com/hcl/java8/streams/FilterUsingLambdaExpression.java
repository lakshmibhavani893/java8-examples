package com.hcl.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FilterUsingLambdaExpression {
	 public static void main(String[] args) 
	 //aslist is the static method of the array class
	 //:: Methodreference
	    {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 
	        list.stream()
	            .filter(n -> n % 2 == 0)
	            .forEach(System.out::println);
	    }
}
