package com.cg.JUnit;

import org.junit.jupiter.api.Test;

public class UnitTestingProgram {
	@Test
void accept() {
	System.out.println("hello");
}
	@Test
	void display() {
		int x=5;
		int y= 10;
		System.out.println("Addition is : "+(x+y));
	}
	@Test
	void print() {
		System.out.println("Error 404");
	}
}
