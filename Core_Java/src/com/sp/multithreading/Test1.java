package com.sp.multithreading;

public class Test1 {

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		t.start();
		

	}

}
