package com.sp.javaprogram;



public class SpaceCountString {
	public static void main(String[] args) {
		String s1 = "This is my first String";
		
		int countSpace = 0;
		int upperCase = 0;
		int lowerCase = 0;

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == ' ') {	
				countSpace++;
			}

			else if (Character.isUpperCase(c)) {
				upperCase++;
			} else if (Character.isLowerCase(c)) {
				lowerCase++;

			}

		}
		System.out.println("Count Space--"+countSpace+" Count UpperCase--"+upperCase+"Count Lowercase--"+lowerCase);
	}

	
}
