package com.sp.array;

public class LargestAndSecond {
	public static void main(String[] args) {
		int[] array = { 12, 45, 67, 23, 56 };

		int largest1, largest2, temp;

		largest1 = array[0];
		largest2 = array[1];

		if (largest1 < largest2) {
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}

		for (int i = 2; i < array.length; i++) {
			if (largest1 < array[i]) {
				largest2 = largest1;
				largest1 = array[i];

			} else if (array[i] > largest2 && largest1 != array[i]) {
				largest2 = array[i];
			}
		}
		System.out.println("First max  " + largest1);
		System.out.println("Second max  " + largest2);

	}
}
