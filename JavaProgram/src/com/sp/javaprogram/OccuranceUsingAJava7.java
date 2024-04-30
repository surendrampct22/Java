package com.sp.javaprogram;

public class OccuranceUsingAJava7 {
	

	public static void main(String[] args) {
		

		int[] array = {1, 2, 3, 4, 5, 6, 1, 2, 5, 4};
        int targetValue = 2;

        int count = 0;

        for (int num : array) {
            if (num == targetValue) {
                count++;
            }
        }

        System.out.println("The value " + targetValue + " occurs " + count + " times.");
	}
}
	

