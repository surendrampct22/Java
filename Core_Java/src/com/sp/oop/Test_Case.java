package com.sp.oop;

public class Test_Case implements Demo_Inteface {

	@Override
	public void Test() {
		int i=0;
		while(i<3) {
			
			System.out.println(i);
			i++;
		}
		

	}

	public static void main(String[] args) {
		Test_Case tc=new Test_Case();
		tc.Test();

	}

}
