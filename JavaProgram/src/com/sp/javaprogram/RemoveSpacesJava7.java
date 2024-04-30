package com.sp.javaprogram;

public class RemoveSpacesJava7 {
	public static void main(String[] args) {
		String inputString = "This is a sample string with spaces.";

		// Remove spaces using a loop
		char[] ch = inputString.toCharArray();
		String stringWithoutSpaces = "";

		for (int i = 0; i < ch.length; i++) {
			if (!Character.isWhitespace(ch[i])) {
				stringWithoutSpaces += ch[i];
			}
		}

		// Print the result
		System.out.println("Original string: " + inputString);
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}
}