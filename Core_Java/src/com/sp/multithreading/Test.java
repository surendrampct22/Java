package com.sp.multithreading;

public class Test {
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		MyThread1 mt1=new MyThread1();
		
		mt1.start();
		mt.start();
		
	}

}
