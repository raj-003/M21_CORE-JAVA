package com.cg.lamexp;
interface D{
	void show (String str1, String str2);
}

public class Lambdaexp {

	public static void main(String[] args) {
	/*D d=(String str1, String str2)->
	{
		return str1+str2;
	};*/
		D obj=(String a, String b)->(a+b)
	System.out.println("Strings are :" +obj.show("Hi"," "+ "hello"));
	}

}
