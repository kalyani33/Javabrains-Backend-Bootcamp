package io.javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        
        ListIterator<String> iterator = list.listIterator();
        System.out.println("List in Forward order:: ");
        while(iterator.hasNext()) {
        	System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("List in Reverse order:: ");
        while(iterator.hasPrevious()) {
        	System.out.print(iterator.previous() + " ");
        }
    }
}

/* OUTPUT::
 * List in Forward order:: Item 1 Item 2 Item 3 Item 4 Item 5
 * 
 * List in Reverse order:: Item 5 Item 4 Item 3 Item 2 Item 1
 */