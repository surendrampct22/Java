package com.sp.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		HashMap<Character, String> hashmap = new HashMap<Character, String>();
		hashmap.put('s', "Surendra");
		hashmap.put('p', "Pratap");
		hashmap.put('s', "Singh");
		hashmap.put('k', "Kushwaha");

		System.out.println(hashmap);

		// Using java 8
		hashmap.forEach((key, value) -> {
			System.out.println(" key " + key + " value " + value);
		});

		// normal way for key
		Set<Character> s = hashmap.keySet();
		System.out.println(s);

		// for value
		Collection<String> s1 = hashmap.values();
		System.out.println(s1);

		// for entry
		Set<Entry<Character, String>> s2 = hashmap.entrySet();
		System.out.println(s2);

		//using a iterator
		Iterator<Entry<Character, String>> i = s2.iterator();
		while (i.hasNext()) {
			Entry<Character, String> map = i.next();
			System.out.println("Key " + map.getKey() + " value " + map.getValue());
		}

	}

}