package com.hcl.java8.methodreference;


interface Calculator{
	void add(int number1,int number2);
}

class Calc{
	public static void addSomething(int number1,int number2) {
		System.out.println(number1+" and "+number2+ " addition is "+(number1+number2));
	}
}
public class MethodReferenceExample {

	public static void main(String[] args) {
	Calculator calc=Calc::addSomething;
	calc.add(10, 20);

	}

}
