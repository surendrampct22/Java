package com.sp.javaprogram;

public class UseSplitMethod {
	public static void main(String[] args) {
		String s = "This is my first split ";
		int spaceCount = 0;
		int upperCase = 0;
		int lowerCase = 0;

		String[] s1 = s.split(" ");

		for (String word : s1) {
			// System.out.print(word);
			//
			// System.out.println();
			for (char ch : word.toCharArray()) {
				// System.out.println(ch);
				if (Character.isUpperCase(ch)) {

					upperCase++;
				} else if (Character.isLowerCase(ch)) {

					lowerCase++;

				}

			}

		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {

				spaceCount++;

			}
		}

		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println(spaceCount);
	}
}
