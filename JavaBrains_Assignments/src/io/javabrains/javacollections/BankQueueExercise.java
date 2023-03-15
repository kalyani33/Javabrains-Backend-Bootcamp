package io.javabrains.javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// Implement the BankQueue class and methods. Look at the main method
// for clues on what the methods need to do

class BankQueue {
	Queue<String> que = new PriorityQueue<>();

    public void addCustomer(String customerName) {
    	que.add(customerName);
    }

    //
    public String removeNextCustomer() {
    	return que.poll();
    }

    public int getNumCustomers() {
    	return que.size();
    }

    public String peekNextCustomer() {
    	return que.peek();
    }

    public String peekLastCustomer() {
    	//Couldn't find any predefined method to implement this
    	return "";
    }

    public void displayCustomers() {
        Iterator<String> iterator = que.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next() + " ");
        }
    }
}

public class BankQueueExercise {
    public static void main(String[] args) {
        BankQueue queue = new BankQueue();

        // Add some customers to the queue
        queue.addCustomer("Christie");
        queue.addCustomer("Rowling");
        queue.addCustomer("Steel");

        // Display the number of customers in the queue
        System.out.println("Number of customers in the queue: " + queue.getNumCustomers());

        // Display the name of the next customer in the queue
        System.out.println("Next customer in the queue: " + queue.peekNextCustomer());

        // Display the name of the last customer in the queue
        System.out.println("Last customer in the queue: " + queue.peekLastCustomer());

        // Display the names of all the customers in the queue
        System.out.println("Customers in the queue:");
        queue.displayCustomers();

        // Remove the next customer from the front of the queue
        String nextCustomer = queue.removeNextCustomer();
        System.out.println("Removed customer: " + nextCustomer);

        // Display the updated number of customers in the queue
        System.out.println("Number of customers in the queue: " + queue.getNumCustomers());
    }
}


//OUTPUT::
//	Number of customers in the queue: 3
//	Next customer in the queue: Christie
//	Last customer in the queue: Christie
//	Customers in the queue:
//	Christie 
//	Rowling 
//	Steel 
//	Removed customer: Christie
//	Number of customers in the queue: 2
