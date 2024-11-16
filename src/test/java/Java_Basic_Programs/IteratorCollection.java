package Java_Basic_Programs;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 1. hasNext () 
	is a method ,it returns true if the collection is having one or more elements. It returns false , if the collection has no element.

	2.Next() 
	is a method used to return an object.
----------------------------------------------------------------	
	* 	Types of Cursor:
	* 1. Iterator:
	* 2. List Iterator
 */


public class IteratorCollection {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();

		a.add(5);
		a.add("Susham");
		a.add(2.0);
		a.add('a');

		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
