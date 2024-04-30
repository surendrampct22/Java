package com.sp.javaprogram;

import java.util.HashMap;
import java.util.Map;

public class Character_Occurance {

	static int maxValue;
	static char maxChar;

	public static void main(String[] args) {
		String s1 = "surendra";
		char[] ch = s1.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);

			} else {
				map.put(ch[i], 1);
			}

              if (map.get(ch[i]) > maxValue) {// 1>0
				maxChar = ch[i];
				maxValue = map.get(ch[i]);

			}
			// System.out.println(map.get(ch[i]));
			System.out.println(ch[i]);
		}
		System.out.println(maxChar + " = " + maxValue);

		System.out.println(map);
		System.out.println(map.get(1));

		// for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		// System.out.println(entry.getKey()+" "+entry.getValue());
//	}
		// map.forEach((k,v)->System.out.println(k+" "+v));

	}

	
}