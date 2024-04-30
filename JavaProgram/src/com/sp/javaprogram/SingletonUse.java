package com.sp.javaprogram;

public class SingletonUse {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Singleton s=Singleton.getInstance();
//		Singleton s1=Singleton.getInstance();
		
		Singleton s=Singleton.getInstance();
		Singleton s1=(Singleton) s.clone();
		
		System.out.println(s.hashCode()+"  "+s1.hashCode());
		
		
		

	}

}
