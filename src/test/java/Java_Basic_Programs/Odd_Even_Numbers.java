package Java_Basic_Programs;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	WAP to display even number and remove add number from collection?
 * 	
 * Array List:
	1.Uses dynamic  array to store the elements.
	2. In Array list bit shifting is required, if any elements are removed from the Array or if any elements added 
	to the array all the bits are shifted to the memory, so manipulation is slow.
	3. All the methods of Array list are not synchronized and not a thread safe and it is multithreaded.
	4. Once if the array list object is created the initial capacity of Array list is 10, once if it exceeds it uses one formula
	 to create the memory allocation i.e.
                  new capacity = old capacity *3/2+1
	4. The underlying data structure is dynamic Array.
	5. Duplicate objects are allowed, Insertion order is preserved, heterogeneous values are allowed.
	6. It is an index based collection, Array list is best choice if our frequent operation is retrievable. Array list implements random access interface,
	 this random access interface helps us to retrieve the object faster.
	 
 2. Iterator:
	a. It is a universal cursor i.e. it is applicable for all kind of list interface classes and set interface classes.
	b. It is a single directional cursor i.e. we can display the elements only in forward direction. By using iterator we can 
		perform only read and remove operation (we can’t perform addition and replacement).

 */

public class Odd_Even_Numbers {

	public static void main(String[] args) {

		ArrayList l=new ArrayList();
		ArrayList Even =new ArrayList();
		ArrayList Odd =new ArrayList();
		
		l.add(4);
		l.add(1);
		l.add(5);
		l.add(6);
		l.add(10);
		System.out.println(l);
		
		Iterator it=l.iterator();
		
		while(it.hasNext()) {
			Integer i=(Integer)it.next();
			
			//PRINT EVEN AND ODD NUMBERS SEPARATELY
			/*if(i%2==0) {
				System.out.println("The number is Even number --"+i);
			}else {
				System.out.println("The Number is ODD Number --"+i);
			}*/
			
			if(i%2==0){
				Even.add(i);
			}else {
				Odd.add(i);
			}
			
			//REMOVE ODD NUMBERS FROM THE  ARRAYLIST 'L'
			if((i%2)!=0) {
				it.remove();
				
			}
			
		}
		
		System.out.println("Remove Odd Numbers from the Collection -- "+l);
		System.out.println("Even Numbers are --"+Even);
		System.out.println("Odd Numbers are -- "+ Odd);

	}

}
