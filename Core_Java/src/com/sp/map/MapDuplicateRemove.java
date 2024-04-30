package com.sp.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDuplicateRemove {
	public static void main(String[] args) {
		int i[] = { 1, 10, 3, 4, 5, 6, 7, 8, 9, 1, 2, 5, 8 };
		int value = 1;

		HashMap<Integer, Integer> h = new HashMap<>();

		for (int n : i) {
			if (!h.containsKey(n)) {
				h.put(n, value);
			}
		}

		List<Integer> array = new ArrayList<>(h.keySet());
		array.sort(Integer::compareTo);
		for (int val : array) {
			System.out.println(val);
		}
	}
}
