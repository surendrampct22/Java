package com.sp.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementTwoList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 5));
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2, 3));
		list.retainAll(list1);// Remove all element from list which is not present in list1
		System.out.println("List--------------");
		System.out.println(list);
		System.out.println("List1-------------");
		System.out.println(list1);
	}
}