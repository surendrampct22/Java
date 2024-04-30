package com.sp.java8;
//
//public class Test implements FunctionalDemo{
//
//	@Override
//	public Boolean m1(int t) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}

public class Test{
	public static void main(String[] args) {
		FunctionalDemo f= (t)->t>1;
		System.out.println(f.m1(0));
		
	}
	
}