package com.sp.oop;

class abc {
	public static void m1() {

		System.out.println("Hello");
	}
}

public class Demo123 extends abc {

	
	public static void m1() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		abc a=new abc();
		a.m1();
		Demo123 d=new Demo123();
		d.m1();
		
		abc a1=new Demo123();
		a1.m1();
		
	}
}
