package io.javabrains.javabasics;

/*
Create a class `Rectangle1` with the following attributes: `width`, `height`, and a static variable `numOfRectangle1s` which will keep track of the number of Rectangle1s created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the Rectangle1.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the Rectangle1.
4.  Create a method `getNumOfRectangle1s` that returns the value of the `numOfRectangle1s` static variable.
5.  In this main method, create several `Rectangle1` objects, calculate and print their area and perimeter, and finally print the number of Rectangle1s created without keeping count in this class.
 */

class Rectangle1{
	private double width;
	private double height;
	static int numOfRectangle1s;
	
	public Rectangle1(double width, double height) {
		numOfRectangle1s += 1;
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
	public int getNumOfRectangle1s() {
		return numOfRectangle1s;
	}
	@Override
	public String toString() {
		return "Rectangle1 [getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + ", getNumOfRectangle1s()="
				+ getNumOfRectangle1s() + "]";
	}
	
	
	
}
public class StaticChallenge {

    public static void main(String[] args) {
    	Rectangle1 r1 = new Rectangle1(10, 12);
    	System.out.println(r1);
    	Rectangle1 r2 = new Rectangle1(10, 12);
    	System.out.println(r1);
    	Rectangle1 r3 = new Rectangle1(10, 12);
    	System.out.println(r1);
    	Rectangle1 r4 = new Rectangle1(10, 12);
    	System.out.println(r1);

    }
}
