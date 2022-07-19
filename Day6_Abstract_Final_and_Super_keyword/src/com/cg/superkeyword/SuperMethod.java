package com.cg.superkeyword;
//super keyword  method is used to access parent class
class First{
	public int a=10,b=20;
	public void display() {
		System.out.println("addition of a and b is:"+(a+b));
	}
}
class Second extends First{
	public void display() {
		System.out.println("Dog is hungry");
	}
	void print() {
		display();
		super.display();//super keyword is used to access parent class.
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Second s= new Second();//child class object is created.
		s.print();
	}

}
