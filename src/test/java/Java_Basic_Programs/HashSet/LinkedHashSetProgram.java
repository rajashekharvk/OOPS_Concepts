package Java_Basic_Programs.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;


/*
 * 	9Linked Hash Set:
	1.Linked  Hash set is a child class  of  hash set.
	2. Duplicate objects are not allowed, Insertion order is preserved, heterogeneous objects are allowed.
 */

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		
		LinkedHashSet h= new LinkedHashSet();
		h.add(7);
		h.add(1);
		h.add(9);
		h.add("sushma");
		h.add(7); // this duplicate value is not store in collection
		
		Iterator<Integer> it =h.iterator();
		while(it.hasNext()) {
			System.out.println("Hash Set Collection "+it.next());
		}

	}

}
