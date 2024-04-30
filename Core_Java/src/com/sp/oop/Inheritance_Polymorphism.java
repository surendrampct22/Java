package com.sp.oop;

class Animal {
	void sound() {
		System.out.println("Animal make a sound");
	}
}

class Dog extends Animal {
	@Override
	// method to provide their own implementations.
	void sound() {
		System.out.println("Dog make a Sound");
	}
}

class Cat extends Animal {
	@Override
	// method to provide their own implementations.
	void sound() {
		System.out.println("Cat make a sound");
	}
}

public class Inheritance_Polymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();

		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();

		System.out.println("Polymorphism Example");
		Animal animal = new Cat();
		animal.sound();

		Animal animal2 = new Dog();
		animal2.sound();

	}

}
	