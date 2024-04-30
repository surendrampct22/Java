package com.sp.javaprogram;

public class MissingNumber {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6 };
		int n = array.length + 1;
		int totalSum = n * (n + 1) / 2;
		int remSum = 0;

		for (int num:array) {
			remSum+=num;
		}

		int missingNumber = totalSum - remSum;
		System.out.println(missingNumber);
	}

}
