package com.hcl.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortComparatorDemo {
	 public static void main(String[] args) 
	    { 
    // Creating a list of Integers 
    List<Integer> list = Arrays.asList(5, -10, 7, -18, 23); 

    System.out.println("The sorted stream according "
                       + "to provided Comparator is : "); 

    // Displaying the list of Strings in 
    // reverse order after sorting 
    list.stream().sorted(Comparator.reverseOrder()). 
                      forEach(System.out::println); 
} 
} 

