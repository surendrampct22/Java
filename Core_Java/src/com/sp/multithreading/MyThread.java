package com.sp.multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {
		int j=0;
	 for(int i=1;i<=20;i++) {
	j++;	
		if(i%2==0) {
			System.out.println(i);
		}
	 }
	

}
}
