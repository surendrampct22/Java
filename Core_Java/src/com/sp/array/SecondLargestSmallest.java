package com.sp.array;

public class SecondLargestSmallest {

	public static void main(String[] args) {

		int[] array = { 2, 1, 5, 3, 4, 9, 7, 4, 11 };

		int temp = 0  ;
		int a = array.length;

		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				}
			}
		}
		System.out.println(array[0]);
		System.out.println(array[a - 2]);

	}

}
