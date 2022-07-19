package com.cg.superkeyword;
//super keyword is used to invoke constructor class
class A{
	void  a() {
		System.out.println("parent class constructor");
	}
}
class B extends A{
	 void b() {
		super.a();
		System.out.println("child class constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		B b=new B();
	}

}
