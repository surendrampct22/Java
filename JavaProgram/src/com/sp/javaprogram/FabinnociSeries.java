package com.sp.javaprogram;

public class FabinnociSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21....
		int first = 0;
		int second = 1;
		int next = 0;
		int total = 10;
		System.out.print(first + "," + second);
		for (int i = 2; i < total; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print("," + next);
		}

	}

}
