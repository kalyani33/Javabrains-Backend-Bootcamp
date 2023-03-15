package io.javabrains.javacollections;

import java.util.ArrayList;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

public class ListExercise {

    public static void main(String[] args) {
    	ArrayList<Integer> nums = new ArrayList<>();
    	nums.add(10);
    	nums.add(100);
    	nums.add(34);
    	nums.add(123);
    	int sum = 0;
    	for(Integer num:nums) {
    		sum += num;
    	}
    	System.out.println("Sum is :: " + sum);

    }

}
/*
 * Output: Sum is :: 267
 */