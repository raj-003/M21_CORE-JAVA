package com.cg.ThisKeyword;
//5.this keyword is used to invoke the current class constructor.
public class ClassConstructor {
	int a=10;
 ClassConstructor(){
	
		System.out.println("Inside default constructor");
	}
	ClassConstructor(int a) {
		this.a=a;
		System.out.println("Inside Parameter constructor");
	}

	public static void main(String[] args) {
		ClassConstructor c= new ClassConstructor();
		c.ClassConstructor();
	}
	
		
		
	}


