package com.sp.multithreading;



public class ThreadMethodDemo {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Mythread10 mt = new Mythread10();
		Mythread10 mt1 = new Mythread10();
		mt.start();
		mt1.start();

		System.out.println(mt.getName());
		System.out.println(mt1.getName());

		mt.setName("CustomThread-0");
		mt1.setName("CustomThread-1");

		System.out.println(mt.getPriority());
		System.out.println(mt1.getPriority());

		mt.setPriority(5);
		mt1.setPriority(10);

		System.out.println(mt.MIN_PRIORITY);
		System.out.println(mt1.MAX_PRIORITY);

		try {
			System.out.println("thread 1 is Sleeping");
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			mt.join();
			mt1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		try {
			mt.wait(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("main Thread is exiting");

	}

}