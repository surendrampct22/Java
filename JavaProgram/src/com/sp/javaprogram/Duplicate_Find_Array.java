package com.sp.javaprogram;

import java.util.Arrays;

public class Duplicate_Find_Array {
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 2, 3, 4, 8, 5 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					
					System.out.println(array[i]);

				}
			}
		}
		
		//Arrays.stream(array).forEach(a->System.out.println(a));

		int [] arrays=Arrays.stream(array).distinct().toArray();
		
		Arrays.stream(arrays).forEach(a->System.out.print(a));
		
		System.out.println(arrays);
	}

}
