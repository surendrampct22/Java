package com.sp.oop;

public class Main {
	public static void main(String[] args) {
		Animal1 animal=new Animal1("Moti", 13);
	    Dog1 dog=new Dog1("motimain", 130, "cake");
	    
	    animal.setName("new Moti");
	    
	    System.out.println(animal.getName());
	    System.out.println(animal.getAge());
	    
	    System.out.println(dog.getName());
	    System.out.println(dog.getAge());
	    
	    dog.dogMethod();
	    dog.makeSound();
	   


	    
	    
	}

}
