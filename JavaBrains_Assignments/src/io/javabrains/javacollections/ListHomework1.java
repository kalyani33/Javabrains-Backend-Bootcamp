package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

class Homework {
	
	List<Integer> nums = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	//Adding an element to List
	public String addElement(){
		System.out.println("Enter an element to add ");
		Integer ele = sc.nextInt();
		nums.add(ele);
		return "Added";
	}
	
	//Removing an element from List
	public String removeElement(){
		System.out.println("Enter an element to remove ");
		Integer ele = sc.nextInt();
		if(nums.contains(ele)){
			nums.remove(ele);
		}
		else {
			return "No element found with value " + ele;
		}
		return "Removed";
	}
	
	//Minimum element in the list
	public String minEle() {
		if(nums.isEmpty())
			return "No elements found in the list";
		Integer min = Integer.MAX_VALUE;
		for(int num:nums) {
			if(num<min)
				min = num;
		}
		return min + " is the Minimum element in the list";
	}
	//Maximum element in the list
		public String maxEle() {
			if(nums.isEmpty())
				return "No elements found in the list";
			Integer max = Integer.MIN_VALUE;
			for(int num:nums) {
				if(num>max)
					max = num;
			}
			return max + " is the Maximum element in the list";
		}
		//Print the contents of List
		public String printEles() {
			if(nums.isEmpty())
				return "List is empty";
			Iterator<Integer> iterator = nums.iterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next()+" ");
			}
			return "";
		}
}
public class ListHomework1{
	public static void main(String args[]) {
		Homework hw = new Homework();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select an option ::");
			System.out.println("1.Add\n2.Remove\n3.Minimum\n4.Maximum\n5.Print\n6.Quit\n");
			int op = sc.nextInt();
			switch(op) {
			case 1: System.out.println(hw.addElement());break;
			case 2: System.out.println(hw.removeElement());break;
			case 3: System.out.println(hw.minEle());break;
			case 4: System.out.println(hw.maxEle());break;
			case 5: System.out.println(hw.printEles());break;
			case 6: System.exit(0);break;
			default:System.err.println("Please enter correct option");
			}
		}
	}
	
}

