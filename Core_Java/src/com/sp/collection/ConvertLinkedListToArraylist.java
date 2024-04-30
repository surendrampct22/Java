package com.sp.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArraylist {
	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();
		ArrayList<String> arraylist = new ArrayList<String>();
		l.add("apple");
		l.add("mango");
		arraylist.add("Cake");
		arraylist.add("Pizza");

		// convert
		ArrayList<String> al = new ArrayList<String>();
		for (String item : l) {
			al.add(item);
		}
		LinkedList<String> linkedlist = new LinkedList<String>();
		for (String junk : arraylist) {
			linkedlist.add(junk);

		}

		System.out.println(al);
		// System.out.println(l);
		System.out.println(linkedlist);

	}

}