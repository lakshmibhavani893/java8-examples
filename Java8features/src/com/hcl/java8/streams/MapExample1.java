package com.hcl.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(0,40,20,50);
	List<Integer> s=list.stream().filter(l->l.intValue()>40).map(i->i+5).collect(Collectors.toList());
	List<Integer> s2=list.stream().map(i->i+5).collect(Collectors.toList());
	s.forEach(System.out::println);
	s2.forEach(System.out::println);

}
}
