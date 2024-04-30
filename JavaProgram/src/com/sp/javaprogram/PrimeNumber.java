package com.sp.javaprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 17;
		int temp = 0;

		for (int i = 1; i <= num-1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("not ok");
		} else {
			System.out.println("good");
		}

	}

}
