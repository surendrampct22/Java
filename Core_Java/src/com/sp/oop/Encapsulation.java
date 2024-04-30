package com.sp.oop;

class Example {
	private int id;
	private String name;

	// Constructor
	public Example(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getter for id
	public int getId() {
		return id;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for id
	public void setId(int id) {
		this.id = id;
	}

	// setter for name
	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation {
	public static void main(String[] args) {

		// using a Constructor to set a value and get a value
		Example example = new Example(101, "Surendra");
		System.out.println("Id : " + example.getId());
		System.out.println("Name : " + example.getName());

		// Update a value using a setter
		System.out.println("");
		example.setId(102);
		example.setName("SP");

		System.out.println("Updated Id : " + example.getId());
		System.out.println("Updated Name : " + example.getName());
	}
}