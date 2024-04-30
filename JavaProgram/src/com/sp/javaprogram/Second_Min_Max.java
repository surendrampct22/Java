package com.sp.javaprogram;

public class Second_Min_Max {
	public static void main(String[] args) {
		int[] num = { 8, 5, 2, 1, 4, 7, 9, 6, 3 };

		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		System.out.println(min);
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				secondMin = min;
				min = num[i];
			} else if (num[i] < secondMin && num[i] != min) {
				secondMin = num[i];
			}

			if (num[i] > max) {
				secondMax = max;
				max = num[i];
			} else if (num[i] > secondMax && num[i] != max) {
				secondMax = num[i];
			}
		}

		System.out.println("Second minimum number is: " + secondMin);
		System.out.println("Second maximum number is: " + secondMax);
	}

}
