package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
    	int[] arr = {10,20,30,40,50};
    	
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
    	int sum = 0;
    	double avg = 0;
    	int largest = Integer.MIN_VALUE;
    	
    	for(int num : arr) {
    		sum = sum + num;
    		if(num > largest)
    			largest = num;
    	}
    	
    	System.out.println("Sum is:: " + sum);
    	System.out.println("Avarage is:: " + sum/arr.length);
    	System.out.println("Largest number is :: " + largest);
    	


    }
}
