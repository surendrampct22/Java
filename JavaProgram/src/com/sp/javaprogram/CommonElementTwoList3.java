package com.sp.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementTwoList3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 5));
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		List<Integer> CommonElement = list.stream().filter(list1::contains).collect(Collectors.toList());
		System.out.println(CommonElement);

	}

}
