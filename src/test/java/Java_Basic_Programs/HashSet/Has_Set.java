package Java_Basic_Programs.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 	Hash Set:
	1. Hash set is a child interface of set interface.
	2. The underlying data structure is hash table.
	3. Duplicate objects are not allowed, Insertion order is not preserved, heterogeneous objects are allowed.
 */

public class Has_Set {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add(7);
		h.add(1);
		h.add(9);
		h.add("sushma");
		h.add(7);
		
		
		System.out.println("Displaying  collection in Hash Set Object "+h);
		
		System.out.println("---------------------");
		System.out.println("For each loop");
		
		for(Object obj:h) {
			System.out.println(obj);
		}
		System.out.println("<.......Iterator cursor........>");
		Iterator it= h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

		
		
		
	}

}
