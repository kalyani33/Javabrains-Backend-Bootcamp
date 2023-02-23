package io.javabrains.javabasics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter the elements of an array ");
		for(int i=0;i<arraySize;i++) {
			array[i] = sc.nextInt();
		}
		int largestNumber = Integer.MIN_VALUE;
		for(int i=0;i<arraySize;i++) {
			if(array[i] > largestNumber) {
				largestNumber = array[i];
			}
		}
		System.out.println("Largest Number in the array is :: " + largestNumber);

	}

}
