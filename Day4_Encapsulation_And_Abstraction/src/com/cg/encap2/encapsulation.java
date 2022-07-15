package com.cg.encap2;

import com.cg.encap1.sbi;

public class encapsulation {

	public static void main(String[] args) {

		sbi s=new sbi();
	
		s.setATM_PIN(1234);
		s.getATM_PIN();
		System.out.print("ATM PIN:"+s.ATM_PIN);
	
	}

}