package com.sp.javaprogram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceBhanu {

	public static void main(String[] args) {
		String s = "BhanuBhanu";// b=1//{'B','h','a','n'....}
		Map<Character, Long> hashmap = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(hashmap);

	}

}
