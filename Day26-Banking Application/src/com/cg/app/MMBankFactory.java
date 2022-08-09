package com.cg.app;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getnewSavingAcc(int AccNo, String accNm, float accBal, float isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getnewCurrentAcc(int AccNo, String accNm, float accBal, int creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
