package io.javabrains.javabasics;

import java.util.Arrays;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */
class Animal{
	private String name;
	private Integer age;
	
	public Animal(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void makeSound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	private String breed;

	public Dog(String name, Integer age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}
class Cat extends Animal{
	private int lives;

	public Cat(String name, Integer age, int lives) {
		super(name, age);
		this.lives = lives;
	}
	@Override
	public void makeSound() {
		System.out.println("The cat meows");
	}
	
}

public class InheritanceChallenge {

    public static void main(String[] args) {
    	Animal[] animals = new Animal[4];
    	animals[0] = new Cat("Cat",3,5);
    	animals[1] = new Dog("Dog",5,"labrador");
    	animals[2] = new Animal("Lion",10);
    	animals[3] = new Animal("Elephant",50);
    	
    	for(Animal animal:animals) {
    		System.out.print("Animal Name: " + animal.getName() + " ,Age : " + animal.getAge() + " --->");
    		animal.makeSound();
    	}
    	
    }
}
