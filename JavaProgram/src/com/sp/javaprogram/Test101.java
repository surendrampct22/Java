package com.sp.javaprogram;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test101 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(101);
		array.add(102);
		array.add(101);

		for (int i : array) {
			LinkedList<Integer> ll = new LinkedList<Integer>();
			ll.add(i);
			
			
			
			
			System.out.println(i);
		}
	

	}

}
