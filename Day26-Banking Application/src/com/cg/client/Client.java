package com.cg.client;

import com.cg.app.MMBankFactory;
import com.cg.app.MMCurrentAcc;
import com.cg.app.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
	BankFactory b=new MMBankFactory();
	SavingAcc s= new MMSavingAcc(123, " Raj ",50000 , 1000);
	CurrentAcc c= new MMCurrentAcc(345, " RAJ ", 100000);
	System.out.println("Saving Account");
	s.withdraw(1000);
	System.out.println("urrent Account");
	c.withdraw(10000);
	System.out.println(s);
	System.out.println(c);

	}

}
