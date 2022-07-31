package com.cg.multithreading;

public class main1 {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
				System.out.println("Current Thread :"+t);
				t.setName("XYZ");
				System.out.println("Current Thread :"+t);
				try {
					Thread.sleep(1);
					
				}
				catch(InterruptedException e){
					System.out.println("Main Thread Interupted :");
				}
			
	}

}
