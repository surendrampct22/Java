package com.sp.multithreading;

public class Example {
	public static synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Current Thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public  synchronized void m2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Current Thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Example e = new Example();
		
			
		
		Thread t2 = new Thread(e::m2);
		Thread t = new Thread(Example::m1);
		t.start();
		t2.start();

	}
}
