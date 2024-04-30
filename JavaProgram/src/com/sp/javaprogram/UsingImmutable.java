package com.sp.javaprogram;

public class UsingImmutable {
	public static void main(String[] args) {
		CustomImmutable ci=new CustomImmutable(101, "spsingh");
		System.out.println(ci.hashCode());
		String c2=ci.getName();
		System.out.println(c2.hashCode());
		//System.out.println(c2.hashCode());
		
	}

}
