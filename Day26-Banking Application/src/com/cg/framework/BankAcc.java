package com.cg.framework;

public abstract class BankAcc {
	private int AccNo;
	private String accNm;
	private float accbal;
//constructor
	public BankAcc(int accNo, String accNm, float accbal) {
		super();
		AccNo = accNo;
		this.accNm = accNm;
		this.accbal = accbal;
	}
	public int getAccNo() {
		return AccNo;
	}
	//abstract method
	abstract public void withdraw(float Minbal);
	public void deposit(float Minbal) {
		System.out.println(Minbal);
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
	//toString
	@Override
	public String toString() {
		return String.format("BankAcc [AccNo=%s, accNm=%s, accbal=%s]", AccNo, accNm, accbal);
	}
	
}
