package io.javabrains.javabasics;

public class OOPs1 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,12);
		double area = rec.areaOfRectangle();
		System.out.println("Area of a Rectangle is :: "+ area);
	}

}

class Rectangle{
	private double width;
	private double length;
	
	public Rectangle(double width,double length) {
		this.width = width;
		this.length = length;
	}
	
	public double areaOfRectangle() {
		return width * length;
	}
}
