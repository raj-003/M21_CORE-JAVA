package com.cg.app;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accbal, float isSalaried) {
		super(accNo, accNm, accbal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}

}
