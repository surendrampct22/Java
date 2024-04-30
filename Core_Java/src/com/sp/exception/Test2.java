package com.sp.exception;

class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 2);
			return;
		} 
		
		catch (ArithmeticException e) {
			System.out.println("Enter a catch block");
			//e.toString();
			//e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Clean up code");
		}
	}
}
