package Java_Basic_Programs;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 *	 Linked list:
		1.Uses doubly linked list to store the elements.
		2. In linked list bit shifting is not required, so manipulation is fast.
		3. The underlying data structure is doubly linked list.
		4. Duplicate objects are allowed, Insertion order is preserved, heterogeneous values are allowed.
		5. It is a best choice if our frequent operation is addition or deletion. It is a worst choice if our frequent operation
			is retrievable (compare to array list).
	3. List iterator:
		a. It is a bidirectional cursor i.e. we can display the elements  in both  forward  & backward direction.
		b. It is not a universal cursor i.e. it is applicable only for all kind of list interface classes and it is not applicable 
		for set interface classes.
		c. By using List iterator we can perform read, remove, add and replacement  operation.

	Note: 
	1. Array list and vector are best choice if our frequent operation is retrievable. (Retrievable means in between storing and displaying 
		we don’t required any addition and deletion).
	2. Array list and vector are worst choice if our frequent operation is addition or deletion.
	3. Linked list is a best choice if our frequent operation is addition or deletion.
 */

public class StringRemove_Replace {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("abc");// remove
		l.add("qspider");// add spider
		l.add("jspider");// sushma
		l.add("pqr");
		l.add("xyz");

		ListIterator it = l.listIterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s.equals("abc")) {
				it.remove();
			} else if (s.equals("qspider")) {
				it.add("Spider");
			} else if (s.equals("jspider")) {
				it.set("Pratham");

			}

		}

		System.out.println("After remove add and set new value to string is as --" + l);

	}

}
