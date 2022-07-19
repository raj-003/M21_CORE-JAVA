package com.cg.superkeyword;
//super keyword is used to access parent class instance variable.
class Fruit{
	protected String str="Apple";
}
class Apple extends Fruit{
	String str="Sweet";
	void display() {
		System.out.println(str);
		System.out.println(super .str);//super keyword is used to access
										//parent class in child class.

	}
}

public class SuperVariable {

	public static void main(String[] args) {
		Apple f= new Apple();
	f.display();

	}

}
