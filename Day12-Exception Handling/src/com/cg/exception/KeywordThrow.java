package com.cg.exception;

public class KeywordThrow
{
	public static void validate (int age) {
	if (age<21 || age>21)
	throw new ArithmaticException("Not Eligible")
	else 
		System.out.println("Eligible to attend millitary selection");
	
}\
	public static void main(String[] args) {
		try {
			validate(30);
		}
		catch(ArithmaticException e)
		{
			System.out.println("rest of the code.....");
		}
		

	}

}
