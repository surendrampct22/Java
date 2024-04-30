package com.sp.exception;

public class Test4 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(10 / 0);
		}  catch (NullPointerException ne) {
			//String s = null;
			System.out.println(10/0);
		}
		
		catch (ArithmeticException e) {
			String s = null;
			System.out.println(s.length());
		}

		finally {
			@SuppressWarnings("unused")
			String s = "sp";
			//System.out.println(s.length());
		}
	}
}
