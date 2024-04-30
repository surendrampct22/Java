package com.sp.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementTwoList2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		List<Integer> list3 = new ArrayList<Integer>();

		for (Integer l : list1) {
			if (list2.contains(l)) {
				list3.add(l);
				// System.out.println(l);
			}

		}
		System.out.println(list3);
	}

}
