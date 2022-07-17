package com.cg.OOP;

public class A { 
	int num;
    String name;
    A()
    
    	{ System.out.println("Constructor called"); }
    

}
class B{
	public static void main(String[] args) {
   
        A a = new A();

        { System.out.print(a.name);}
        {  System.out.print(a.num);}
    
}
}
