package com.sp.javaprogram;

public class NumberPalindrom {
	public static void main(String[] args) {
		int i =252;
		int rem=0;
		int sum=0;//252
		int temp=i;
		
		while(i!=0) {
			rem=i%10;
			sum = (sum*10)+rem;
			i=i/10;
			
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("Palindrom");
		}
		else {System.out.println("wrong");}
	}

}
