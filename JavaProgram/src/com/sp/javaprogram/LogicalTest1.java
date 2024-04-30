package com.sp.javaprogram;

public class LogicalTest1 {
	private int x = 10;
	protected int y = 20;
	private static int a = 15;
	private static int b = 20;

	public static void main(String[] args) {
		int x = 11;
		int y = 21;
		int a = 16;
		int b = 25;

		//LogicalTest lt= new LogicalTest();
		//LogicalTest.Test22 tt=it.new Test22();
	new LogicalTest1().new Test22().go();
	}

	class Test22 {
		void go() {
			System.out.println(x + " " + y + " " + a + " " + b);
		}
	}
}
