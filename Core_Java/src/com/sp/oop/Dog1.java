package com.sp.oop;

public class Dog1 extends Animal1 {

	private String bread;

	public Dog1(String name, int age, String bread) {
		super(name, age);
		this.bread = bread;
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " the " + bread + " barks");
	}

	public void dogMethod() {
		System.out.println("This is the dog  method" + getName());
	}

}
