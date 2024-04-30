

package com.sp.javaprogram;

public class Main {
	public static void main(String[] args) {
		int[] array = { 0, 5, 4, 0, 2, 0, 1, 0, 0 };
		// int result[]= {};
		int[] newArray = {};
		int[][] subarrays = rearrangeAndBreakArray(array);

		// Print the subarrays
		for (int[] subarray : subarrays) {

			
			for (int num : subarray) {
				newArray = addValues(newArray, num);

				//System.out.print(num + " ");

			}
		}
		// System.out.print(); // Move to the next line for a new subarray
	}

	private static int[] addValues(int[] array, int... values) {
		int newSize = array.length + values.length;
		int[] newArray = new int[newSize];

		// Copy existing elements to the new array
		System.arraycopy(array, 0, newArray, 0, array.length);

		// Add new values to the end of the new array
		for (int i = 0; i < values.length; i++) {
			newArray[array.length + i] = values[i];
		}

		return newArray;
	}

	private static int[][] rearrangeAndBreakArray(int[] array) {
		int[] rearrangedArray = rearrangeArray(array);
		int chunkSize = 2; // Adjust this according to your needs
		int numberOfSubarrays = (int) Math.ceil((double) rearrangedArray.length / chunkSize);

		int[][] subarrays = new int[numberOfSubarrays][chunkSize];
		int index = 0;

		// Copy elements to subarrays
		for (int i = 0; i < numberOfSubarrays; i++) {
			for (int j = 0; j < chunkSize; j++) {
				if (index < rearrangedArray.length) {
					subarrays[i][j] = rearrangedArray[index++];
				} else {
					subarrays[i][j] = 0; // Fill remaining elements with zeros
				}
			}
		}

		return subarrays;
	}

	private static int[] rearrangeArray(int[] array) {
		int[] result = new int[array.length];
		int index = 0;

		// Copy non-zero elements to the result array
		for (int num : array) {
			if (num != 0) {
				result[index++] = num;
			}
		}

		// Fill the remaining elements with zeros
		while (index < array.length) {
			result[index++] = 0;
		}

		return result;
	}
}
