package com.cg.JUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram {
	@BeforeAll
	@Test
	static void display() {
		System.out.println("@BeforeAll-execuutes once before all the test method in this class");
	}
	@BeforeEach
	@Test
	void accept() {
		System.out.println("@BeforeEach-executes before each test method in this class");
	}
	@Test
	void print() {
		System.out.println("Hello Friends");
	}

}
