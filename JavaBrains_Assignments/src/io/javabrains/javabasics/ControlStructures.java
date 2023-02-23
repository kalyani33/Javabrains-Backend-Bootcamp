package io.javabrains.javabasics;

import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args) {
		System.out.println("Enter a number:: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("Entered Number is :: ZERO");
		}
		else if(num > 0) {
			System.out.println("Entered Number is :: POSITIVE");
		}
		else if(num < 0) {
			System.out.println("Entered Number is :: NEGATIVE");
		}
		else {
			System.out.println("Pls enter a number");
		}

	}

}
