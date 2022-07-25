package com.cg.strings;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		s.close();
	}

}
