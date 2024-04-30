package com.sp.oop;

public class SampleAbstract  extends DemoAbstract{

	SampleAbstract(int id){
	super(id);
	}
	
	public static void main(String[] args) {
		SampleAbstract  s=new SampleAbstract(10);
		System.out.println(s.id);
		
	}
}
