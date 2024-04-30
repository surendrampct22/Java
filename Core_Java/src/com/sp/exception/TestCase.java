package com.sp.exception;

public class TestCase {

	public static void main(String[] args) {
		System.out.println(methodOne());
	}

	@SuppressWarnings("finally")
	public static int methodOne() {
		try {
			System.out.println(10 / 2);//Exception rise and go to catch block
			return 777;
		} 
		
		catch (ArithmeticException e) {//handling the exception
			return 888;
		}
		
		finally {
			System.out.println("Enter a finally block");
			return 999;
		}
	}
}
