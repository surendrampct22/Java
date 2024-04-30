package com.sp.javaprogram;

public class Reverse_String {
	public static void main(String[] args) {

		String s1 = "surendra";
		String s = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(i);
			
			s = s + s1.charAt(i);
		}
		System.out.println(s);
		//System.out.println(s1.length());
	}
}
