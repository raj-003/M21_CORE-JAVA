package com.capgemini.intro;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		int n1,n2,sum ;
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter first number: ");
		    n1 = sc.nextInt();
		    System.out.println("Enter second number: ");
		    n2 = sc.nextInt();
		
		    sum = n1 + n2;
		    
		  System.out.println("Sum of two numbers: " + sum);

	}

}