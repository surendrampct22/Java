package com.sp.javaprogram;

public class Fabiser {
	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21
		
		int first=0;
		int second=1;
		int total=7;
		int next=0;
		
		for(int i=2;i<total;i++) {
			next=first+second;
			first=second;
			second=next;
		}
		System.out.println(next);
	}

}
