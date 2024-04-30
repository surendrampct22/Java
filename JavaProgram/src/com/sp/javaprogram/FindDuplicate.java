package com.sp.javaprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//input :  List list = Arrays.asList(12,21,34,34,45,45,67);  
//output : 12,21,34,45,67
public class FindDuplicate {
	
	// find the duplicate element using a java 8
	public static List<Integer> _uniqueList(List<Integer> list){
		List<Integer> uniqueList=list.stream().distinct().collect(Collectors.toList());
		return uniqueList;
		}

		public static void main(String [] args){
			List<Integer> _list =Arrays.asList(12,21,34,34,45,45,67);
		System.out.println(FindDuplicate._uniqueList(_list));
		}

}
