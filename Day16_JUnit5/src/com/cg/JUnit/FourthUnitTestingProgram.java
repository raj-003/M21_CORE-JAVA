package com.cg.JUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram {
	@Test
	void display() {
		int arr[]={1,2,3,4,5};
		//assertAll method will check the whether two parameters value is same or not
		//if it is same you will not get any error otherwise you will get error
		assertAll("arr", ()-> assertEquals(arr[2],3),
		()-> assertEquals(arr[0],1));
	}

}
