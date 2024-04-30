package com.sp.multithreading;

class Mythread10 extends Thread {
	@Override
	public void run() {
	for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
	}
}
