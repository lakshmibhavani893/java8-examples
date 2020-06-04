package com.hcl.java8.lamdaexpression;

@FunctionalInterface
interface Cab{
	void bookCab();//the functional interface has only one abstract method
	
}
public class LamdaDemo {

	public static void main(String[] args) {
		Cab cab=()->{
			System.out.println("Cab is booked!! arriving soon!!");
			};
			cab.bookCab();
	}
	
}
