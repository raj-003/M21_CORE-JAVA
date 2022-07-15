package com.cg.assignment1;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i=1;i<=n;i++){
		for(int j=1;j<=i;j++) {
			
			System.out.print("*");

		}
		System.out.println();
	}

}
}