package com.sp.oop;

public class OverloadinExample {
	
	public void m1() {
		System.out.println(" Argument");
	}
	public void m1(String name) {
		System.out.println(name);
	}
	public void m1(String name,int id) {
		System.out.println(name+""+id);
	}
	
	public static void main(String[] args) {
		OverloadinExample o=new OverloadinExample();
		o.m1();
		o.m1("Sp");
		o.m1("sp", 101);
	}

}
