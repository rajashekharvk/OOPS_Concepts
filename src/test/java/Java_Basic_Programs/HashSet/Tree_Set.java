package Java_Basic_Programs.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 	Tree Set:
 	Duplicate objects are not allowed, Insertion order is preserved, heterogeneous objects are not allowed, 
 	if we are trying to add heterogeneous object we will get class cast exception(because objects are inserted /display in ascending order).
 	Insertion order is not preserved because object will be inserted according to ascending order.
 	
 	Note: the number one searching mechanism is hashing mechanism (hash set or linked hash set)
 	
 	I.Q: Why hash set and linked hash set  or set don’t allow duplicate values?
	Ans:  Because hash set and linked hash set uses hash table to store the value where duplicate object not allowed to store .
	when we create duplicate object , it get stored in same hash bucket in hash table.


 */

public class Tree_Set {

	public static void main(String[] args) {

		TreeSet t= new TreeSet();
		t.add(7);
		t.add(1);
		t.add(9);
		t.add(4);
		t.add(10);
		t.add(4);
//		t.add("sushma"); //gives compile time error,class cast exception
		
		System.out.println(t);
		Iterator it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
