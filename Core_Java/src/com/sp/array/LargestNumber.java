package com.sp.array;

public class LargestNumber {
	public static void main(String[] args) {

		// max no in array
		int[] array = { 1, 4, 2, 9, 4, 7, 8 };
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

		}
		System.out.println("Largest number in array = " + max);
	}
}
