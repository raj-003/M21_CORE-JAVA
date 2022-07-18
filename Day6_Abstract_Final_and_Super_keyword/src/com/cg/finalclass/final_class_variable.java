package com.cg.finalclass;
//final class 
class speed{
 final int speedlimit=100;
	void run() {
		speedlimit=400;
	}
}
public class final_class_variable {

	public static void main(String[] args) {
		speed s= new speed();
		s.run();
	}

}
