package Java_Basic_Programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
 * Display collection elements in reverse
 */
public class LinkedListProgram {

	public static void main(String[] args) {
		
//		List a= new LinkedList<>();
		List a= new ArrayList<>();
		
		a.add(5);
		a.add("Sushama");
		a.add('a');
		
		ListIterator it=a.listIterator();
		System.out.println("FORWORD direction prininting elements  from the  LnkedList");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------");
		
		System.out.println("BACKWORD direction prininting elements  from the  LnkedList");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		

	}

}
