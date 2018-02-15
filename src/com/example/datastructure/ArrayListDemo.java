package com.example.datastructure;

import java.io.Serializable;
import java.util.*;

/**
 * Basic Properties of Array List
 * ------------------------------
 * Resizable array (or) Growable Array
 * Duplicates are allowed
 * Insertion Order is Preserved
 * Heterogeneous Objects can be Inserted
 * Null Insertion is Possible
 *
 *3 Types of Constructors used in ArrayList
 *----------------------------------------
 * 1. ArrayList al = new ArrayList(); This creates a array list of default size 10 and then when reaching capacity
 * recalculates the new capacity = (currentCapacity * 3/2) +1
 * 
 * 2. ArrayList al = new ArrayList(int initialCapacity);
 * 
 * 3. ArrayList al = new ArrayList(Collection c); This is used to convert any collection to array list
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList SimpleArrayList = new ArrayList();
		SimpleArrayList.add("A");
		SimpleArrayList.add(10);
		SimpleArrayList.add("A");
		SimpleArrayList.add(null);
		System.out.println(SimpleArrayList); //[A,10,A,null]
		SimpleArrayList.remove(2);
		System.out.println(SimpleArrayList);//[A,10,null]
		SimpleArrayList.add(2,"M");
		SimpleArrayList.add("N");
		System.out.println(SimpleArrayList);//[A,10,M,null,N]
	
	
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		System.out.println(l1 instanceof Serializable);//true
		System.out.println(l2 instanceof Cloneable);//true
		System.out.println(l1 instanceof RandomAccess);//true
		System.out.println(l2 instanceof RandomAccess);//false
	}

}


/**
 * Where ArrayList is Best choice?
 * 	If our frequent operation is retrival, ArrayList is the Best Choice as it implements RandomAccess
 * 
 * Where ArrayList is worst choice?
 *  If our ArrayList has 1 Crore elements, if we try to insert any element in between, we need so many shift operation.
 *  Hence if insertion in middle and deletion or removal in the middle for 1 Crore element ArrayList, then it require so many shift operation, arrayList is a worst choice. 
 * 
 */
