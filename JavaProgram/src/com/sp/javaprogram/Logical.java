package com.sp.javaprogram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Logical {
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		IntStream it=Arrays.stream(array);
		it.map(e->e+10).filter(e->e%2==0).forEach(e->System.out.println(e));
	}

}