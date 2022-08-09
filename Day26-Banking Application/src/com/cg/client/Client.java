package com.cg.client;

import com.cg.app.MMBankFactory;
import com.cg.app.MMCurrentAcc;
import com.cg.app.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(123," Raj ",1000000,true);
		CurrentAcc c = new MMCurrentAcc(345," RAJ ",50000,50000);
		System.out.println("Saving Account");
		s.withdraw(10000);
		System.out.println("Current Account");
		c.withdraw(1000);
		System.out.println(s);
		System.out.println(c);
	}
}