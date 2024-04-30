package com.sp.oop;

abstract class Shape {
	abstract void draw();

}

class Cricle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a Cricle");

	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");

	}

}

public class Polymorphism {
	public static void main(String[] args) {

		Shape cricle = new Cricle();
		cricle.draw();
		Shape rectangle = new Rectangle();
		rectangle.draw();
	}

}
