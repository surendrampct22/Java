package com.sp.javaprogram;

public class Subarray {
	
	
    public static void main(String[] args) {
        int[] array = {0, 5, 4, 0, 2, 0, 1, 0, 0};
        int result[]=new int[array.length];
        int[][] subarrays = rearrangeAndBreakArray(array);

        // Print the subarrays
        for (int i = 0; i < subarrays.length; i++) {
            for (int j = 0; j < subarrays[i].length; j++) {
                System.out.print(subarrays[i][j] + " ");
            }
            System.out.println();  // Move to the next line for a new subarray
        }
    }

    private static int[][] rearrangeAndBreakArray(int[] array) {
        int[] rearrangedArray = rearrangeArray(array);
        int chunkSize = 2;  // Number of elements per subarray
        int numberOfSubarrays = (int) Math.ceil((double) rearrangedArray.length / chunkSize);

        int[][] subarrays = new int[numberOfSubarrays][chunkSize];
        int index = 0;

        // Copy elements to subarrays
        for (int i = 0; i < numberOfSubarrays; i++) {
            for (int j = 0; j < chunkSize; j++) {
                if (index < rearrangedArray.length) {
                    subarrays[i][j] = rearrangedArray[index++];
                } else {
                    subarrays[i][j] = 0;  // Fill remaining elements with zeros
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
