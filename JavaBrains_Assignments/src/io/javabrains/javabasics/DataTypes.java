package io.javabrains.javabasics;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("Enter Person Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person's Name::");
		String name = sc.next();
		System.out.println("Enter Person's Age ::");
		int age = sc.nextInt();
		System.out.println("Enter Person's Salary ::");
		double salary = sc.nextDouble();
		
		System.out.println("Name:" + name + ", Age:" + age + ", Salary:" + salary);

	}

}
