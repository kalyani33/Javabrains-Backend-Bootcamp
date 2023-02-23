package io.javabrains.javabasics;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		System.out.println("Enter two numbers for performing basic operations");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:: ");
		int num2 = sc.nextInt();
		
		//Addition
		int sumOfTwoNumbers = num1 + num2;
		System.out.println("SUM is ::" + sumOfTwoNumbers);
		//Subtraction
		int subOfTwoNumbers = num1 - num2;
		System.out.println("Subtraction is :: " + subOfTwoNumbers);
		//Multiplication
		int mulOfTwoNumbers = num1 * num2;
		System.out.println("Multiplication is:: " + mulOfTwoNumbers);
		//Division
		double divisionOfTwoNumbers = num1/num2;
		System.out.println("Division is :: " + divisionOfTwoNumbers);
		//Modulus
		int remainderOfTwoNumbers = num1 % num2;
		System.out.println("Remainder is ::" + remainderOfTwoNumbers);
		//Increment
		num1++;
		System.out.println("Num1 is ::" + num1);
		num2--;
		System.out.println("Num2 is ::"+ num2);
		

	}

}
