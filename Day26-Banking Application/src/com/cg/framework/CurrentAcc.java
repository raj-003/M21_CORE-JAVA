package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private boolean creditLimit;
//constructor
	public CurrentAcc(int accNo, String accNm, float accbal) {
		super(accNo, accNm, accbal);
		this.creditLimit=creditLimit;
	}
	//method
		public void withdraw (float Minbal) {
			System.out.println("Account no is:"+this.getAccNo()+"Account name is :"+this.getAccNm()+
					"Balance is :"+Minbal);
		}
		@Override
		public String toString() {
			return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
		}
		
}
