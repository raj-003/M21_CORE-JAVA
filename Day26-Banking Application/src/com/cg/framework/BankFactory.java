package com.cg.framework;

public abstract class BankFactory {
	abstract public SavingAcc getnewSavingAcc(int AccNo, String accNm, float accBal, float isSalaried);
	abstract public CurrentAcc getnewCurrentAcc(int AccNo,String accNm,float accBal,int creditLimit);
}
