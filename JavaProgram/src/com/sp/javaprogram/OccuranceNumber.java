package com.sp.javaprogram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceNumber {
	static int maxValueInteger;
	 static int  maxKeyInteger ;


	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1, 2, 3, 4, 4, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < number.length; i++) {
			if (map.containsKey(number[i])) {
				map.put(number[i], map.get(number[i]) + 1);

			} else {
				map.put(number[i], 1);
			}
			if (map.get(number[i]) > maxValueInteger) {
				maxKeyInteger=number[i];
				maxValueInteger=map.get(number[i]);

			}
		}

		System.out.println(map);
		System.out.println(maxKeyInteger+"="+maxValueInteger);

	}

}