package com.hcl.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUsingCollections {
	
	/*
	 * The toList() method of the Collectors class returns a Collector that
	 * accumulates the input elements into a new List.
	 */
	  public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 
	        List<Integer> evenNumbers = list.stream()
	        		//filter accepts predicate,consumer,supplier
	                    .filter(n -> n % 2 == 0)
	                    .map(n -> n * n)
	                    //Collector<T, ?, List<T>> toList()
	                   .collect(Collectors.toList());
	         
	      System.out.println(evenNumbers);
}
}