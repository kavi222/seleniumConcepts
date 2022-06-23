package javaInterviewPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * List(I) is the Child of Collection(I). ArrayList (C) is one of the classes
		 * provides implementation for the List(I). In list duplicate values are allowed
		 * and the insertion order is maintained. The underlying DS is resizeable Array
		 * or Growable Array. We can insert Heterogeneous objects as well. NOTE: All the
		 * collections can store Heterogeneous objects can be stored except TREE SET and
		 * TREE MAP. ArraList and vector implements RandomAccess, Serializable and
		 * Cloneable Interfaces Synchronized-> No Thread safe-> NO Default capacity-10
		 * Fill Ratio or Load factor:1 or 100% Growth Rate: current_size +
		 * current_size/2
		 */

		List<String> arrayList = new ArrayList<String>();
		// add() used to add the specified element at the end of the List
		arrayList.add("BMW");
		arrayList.add("AUDI");
		arrayList.add("HONDA");
		arrayList.add("MARUTI");
		arrayList.add("SKODA");
		// List allows duplicate elements
		arrayList.add("MARUTI");

		System.out.println(arrayList);

		System.out.println(arrayList.get(3));
		// to check the indexof any element and returns the first occurrence
		System.out.println(arrayList.indexOf("MARUTI"));
		// last index of is used to check the last occurence position
		System.out.println(arrayList.lastIndexOf("MARUTI"));

		// add a list to another list
		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);

		System.out.println(anotherList);

		anotherList.remove(5);
		System.out.println(anotherList);

		//we can even insert null
		anotherList.add(null);
		System.out.println(anotherList);
		
		//set() is used to update the element based on index
		anotherList.set(5, "TOYOTO");
		System.out.println(anotherList);
		
		//isEmpty() method to check the list is empty or not
		System.out.println(anotherList.isEmpty());
		System.out.println("Using for each------------------------------------");
		//Iterate using for each
		for(String string : anotherList) {
			
			System.out.println(string);
		}
		
		System.out.println("Using for loop------------------------------------");
		//using for loop
		for(int i=0; i< anotherList.size(); i++) {
			
			System.out.println(anotherList.get(i));
		}
		System.out.println("using list iterator------------------------------------");
		
		//list iterator and for interface we can't able to create object
		ListIterator<String> li = anotherList.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("------------------------------------");
		// clear to delete all the elements
		anotherList.clear();
		System.out.println("List after clearing " + anotherList);
		System.out.println(anotherList.isEmpty());

	}

}
