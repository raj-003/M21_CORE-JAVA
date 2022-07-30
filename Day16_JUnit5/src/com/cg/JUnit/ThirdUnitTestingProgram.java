package com.cg.JUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram {
	@DisplayName("Test is implemented")
	@Test
	void display() {
		System.out.println("wnat to displahy something");
	}
	@Disabled("Not Impllemented")
	@Test
	void print() {
	System.out.println();
}

}
