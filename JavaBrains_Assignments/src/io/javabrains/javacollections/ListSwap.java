package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

public class ListSwap {

    public static void main(String[] args) {
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(10);
    	nums.add(20);
    	nums.add(30);
    	nums.add(40);
    	System.out.println("Before swap:: " + nums);
    	swap(nums,0,1);
    	System.out.println("After swap:: " + nums);
    	Collections.swap(nums, 0, 1);
    	System.out.println("Using Collection.swap() method:: " + nums);

    }
    //Using normal approach
    public static List<Integer> swap(List<Integer> nums,int pos1,int pos2) {
    	int ele1 = nums.get(pos1);
    	int ele2 = nums.get(pos2);
    	nums.set(pos1, ele2);
    	nums.set(pos2, ele1);
		return nums;
    	
    }
}
//Output::
//	Before swap:: [10, 20, 30, 40]
//			After swap:: [20, 10, 30, 40]
//			Using Collection.swap() method:: [10, 20, 30, 40]
