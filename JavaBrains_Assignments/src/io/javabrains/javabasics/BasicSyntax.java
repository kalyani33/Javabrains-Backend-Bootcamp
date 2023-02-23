package io.javabrains.javabasics;

import java.util.Scanner;

public class BasicSyntax {

	public static void main(String[] args) {
		System.out.println("Enter two numbers for performing SUM,Difference,Product,Quotient:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = scanner.nextInt();
		
		int sumOfTwoNumbers = num1 + num2;
		int differenceOfTwoNumbers = num1 - num2;
		int productOfTwoNumnbers = num1 * num2;
		int quotientOfNumbers = num1/num2;
		
		System.out.println("SUM :: "+sumOfTwoNumbers);
		System.out.println("DIFFERENCE :: "+differenceOfTwoNumbers);
		System.out.println("PRODUCT ::" + productOfTwoNumnbers);
		System.out.println("QUOTIENT :: "+quotientOfNumbers);

	}

}
