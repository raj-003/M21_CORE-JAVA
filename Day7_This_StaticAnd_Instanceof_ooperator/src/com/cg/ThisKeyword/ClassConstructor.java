package com.cg.ThisKeyword;
//5.this keyword is used to invoke the current class constructor.
public class ClassConstructor {
	int a=10;
 ClassConstructor(){
		this(a);
		System.out.println("Inside default constructor");
	}
	void ClassConstructor(int a) {
		this.a=a;
		System.out.println("Inside Parameter constructor");
	}

	public static void main(String[] args) {
		ClassConstructor a= new ClassConstructor();
	a.ClassConstructor(10);
	}

}
