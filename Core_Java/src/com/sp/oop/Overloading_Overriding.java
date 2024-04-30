package com.sp.oop;

class Test {
	public Test m1() {
		System.out.println("Parent");
		return new Test();
	}
}
class Demo extends Test {
	@Override
	public Demo m1() {
		System.out.println("Child");
		return new Demo();
	}
}

public class Overloading_Overriding {

//	public void dispaly() {
//		System.out.println("0 Argument");
//
//	}
//
//	public void dispaly(String name) {
//		System.out.println("1 Argument :" + name);
//
//	}

	public static void main(String[] args) {
		Overloading_Overriding oo = new Overloading_Overriding();
		// oo.dispaly("Surendra");
		// oo.dispaly();
		Test t = new Test();
		t.m1();
		Demo d = new Demo();
		d.m1();
		Test t1 = new Demo();
		t1.m1();

	}
}
