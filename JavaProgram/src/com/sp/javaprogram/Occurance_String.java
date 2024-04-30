package com.sp.javaprogram;

import java.util.HashMap;

public class Occurance_String {

	public static void main(String[] args) {
//      String s1 = "surendra pratap Singh";
//		char[] ch = s1.toCharArray();
//
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//
//		for (int i = 0; i < ch.length; i++) {
//
//			if (map.containsKey(ch[i])) {
//
//				map.put(ch[i], map.get(ch[i]) + 1);
//
//			} else {
//				map.put(ch[i], 1);
//			}
//
//		}
//		System.out.println(map);
		
		String s2 = "urendra pratap singh";
		
		int length=s2.length();
		int middle=s2.length()/2;
		
		char ch=s2.charAt(middle);  
		System.out.println(ch);
		System.out.println();
		System.out.println(middle);
		
		if(length%2==0) {
			System.out.println(s2.length()/2);
		}
		
		
		
	}
}