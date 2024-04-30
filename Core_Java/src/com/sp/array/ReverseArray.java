package com.sp.array;

public class ReverseArray {
	public static void main(String[] args) {
		int array[] = { 5, 2, 1, 3, 7, 8, 1 };
		int length = array.length - 1;
		int temp;
		int start = 0;

		while (start < length) {
			temp = array[start];
			array[start] = array[length];
			array[length] = temp;

			start++;
			length--;

		}

		// Print the reversed array
		System.out.print("Reversed Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
