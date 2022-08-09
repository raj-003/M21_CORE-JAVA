package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
private final float isSalaried;
	public SavingAcc(int accNo, String accNm, float accbal, float isSalaried) {
		super(accNo, accNm, accbal);
		// TODO Auto-generated constructor stub
		this.isSalaried=isSalaried;
	}
	//providing implementation to abstract method of bank account here //Saving account
	public void withdraw(float Minbal) {
		System.out.println("Account no is:"+this.getAccNo()+"Account name is :"+this.getAccNm()+
				"Balance is :"+getAccbal());
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	
}
