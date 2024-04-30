package com.sp.multithreading;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		int i=0;
		for(int j=1;j<=20;j++) {
			 i++;
		if(j%2!=0) {
			System.out.println(j);
		}
		}
		
	}

}
