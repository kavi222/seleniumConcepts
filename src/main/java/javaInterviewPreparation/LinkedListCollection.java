package javaInterviewPreparation;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedListCollection linkedListExample = new LinkedListCollection();
		linkedListExample.linkedListOperationsExample();
		linkedListExample.iterateLinkedListWithSimpleFor();
		linkedListExample.iterationWithAdvancedFor();
		linkedListExample.iterateUsingWhile();
		linkedListExample.iterateUsingIterator();
	}
	
	public void linkedListOperationsExample(){
		/**
		 * LinkedList is implemented using Doubly linked list. This is best suited for insertion and deletion operations.
		 * Unlike ArrayList, this is not the best for retrieving the data.
		 * All the collections implements Serializable and cloneable Interfaces.
		 *  LinkedList also implements those Interfaces but not RandomAccess Interface.
		 */
		LinkedList<Integer> Li = new LinkedList<Integer>(); 
		Li.add(1);
		Li.add(2);
		Li.add(3);
		Li.add(4);
		Li.add(5);
		Li.add(5);
		System.out.println("LinkedList : "+Li);
		Li.addFirst(0);
		System.out.println("LinkedList add first: "+Li);
		System.out.println("LinkedList : "+Li);
		Li.addLast(6);
		System.out.println("LinkedList add last: "+Li);
		System.out.println("LinkedList : "+Li);
		System.out.println("Get First element: "+Li.getFirst());
		System.out.println("Get Last element: "+Li.getLast());
		System.out.println("Remove First element: "+Li.removeFirst());
		System.out.println("LinkedList : "+Li);
		System.out.println("Remove Last element: "+Li.removeLast());
		System.out.println("LinkedList : "+Li);
		System.out.println("removeFirstOccurrence: "+Li.removeFirstOccurrence(5));
		System.out.println("LinkedList : "+Li);
	}
	
	/*
	 * Iteration of Linked List with simple for loop
	 */
	public void iterateLinkedListWithSimpleFor(){
		
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("Simple For loop");
		for (int index=0;index<linkedList.size();index++){
			System.out.println("Elements in the LL are "+ linkedList.get(index));
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
	/*
	 * Iteration of Linked List with Advanced For loop (For each)
	 */
	
	public void iterationWithAdvancedFor(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("For Each");
		for (String string : linkedList) {
			System.out.println("Elements in the LL are "+ string);
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
	/*
	 * Iterate using While
	 */
	public void iterateUsingWhile(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number=0;
		System.out.println("While");
		while(linkedList.size()>number){
			System.out.println("Elements in the LL are "+ linkedList.get(number));
			number++;
		}
		System.out.println("-----------------------------------------------------");
	}
	
	/*
	 * Iterate using Iterator
	 */
	public void iterateUsingIterator(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator=linkedList.iterator();
		System.out.println("Iterator");
		while(iterator.hasNext()){
			System.out.println("Elements in the LL are "+ iterator.next());
		}
		System.out.println("-----------------------------------------------------");
	}
	

}
