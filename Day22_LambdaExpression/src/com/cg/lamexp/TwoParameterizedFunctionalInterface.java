package com.cg.lamexp;
//Functional Interface = which contain only one abstract method
interface E{
	//two-abstract method Parameterized
	String print(String str, String str1);
	
}

public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//lambda exp
		E e=(String str, String str1)->{
			
			return (str, str1);
		};
		System.out.println(e.print("Lambda Expression"));
	}

}
