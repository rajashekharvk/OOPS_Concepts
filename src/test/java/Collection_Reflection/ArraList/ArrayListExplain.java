package Collection_Reflection.ArraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import Aarray.Array;
import SeleniumAssignments.Synchronization;

public class ArrayListExplain {

	public static void main(String[] args) {

		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Java");
		arr1.add("C#");
		arr1.add("Python");

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("JavaScripting");
		arr2.add("VBScripting");

//		Methods opeartion on ArraList

//		arr1.addAll(arr2);
//		System.out.println(arr1); //[Java, C#, Python, JavaScripting, VBScripting]

//		ArrayList<String> arr3= (ArrayList<String>(arr1.clone();
//		System.out.println(arr3); //[Java, C#, Python]
//		
//		System.out.println(arr3.contains("Python")); //true if not false
//		System.out.println(arr3.indexOf("Python"));  //2  if element is not print -1
//		System.out.println(arr3.indexOf("Python")>0);  //true

//		ArrayList<String> arr4 =new ArrayList<String>(Arrays.asList("Raj","Partham","Raj","tom"));
//		System.out.println(arr4.remove(0)); //removing first index element
//		System.out.println(arr4); //[Partham, Raj, tom]
//		
//		System.out.println(arr4.remove("Raj")); // printing true
//		System.out.println(arr4); //[Partham, tom]
		
//		System.out.println(arr4.reversed());  //[tom, Raj, Partham, Raj]
		
//		System.out.println(arr4.removeFirst()); //remove fist element
		

//		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
//
//		ArrayList<Integer> numbers = (ArrayList<Integer>) a.clone();
//		numbers.removeIf(num -> num % 2 != 0);  //Lamda Expression or condition num is the var
//		System.out.println(numbers);

		//Storing arraylist emelents as array on object instances
//		ArrayList<String> newList =new ArrayList<String>(Arrays.asList("Pratham","Raj","Shekhar"));
//		Object arr[]=newList.toArray();
//		System.out.println(Arrays.toString(arr));
//		for(Object o:arr) {
//			System.out.println((String)o);
////			OutPut
////			Pratham
////			Raj
////			Shekhar
//			
//		}
//		
		
		ArrayList<String> arr5= new ArrayList<String>(Arrays.asList("Pratham","Raj","Shekhar","Pratham"));
		
//		System.out.println(arr5.retainAll(Collections.singleton("Pratham"))); //true
//		System.out.println(arr5); //[Pratham, Pratham]
		
		
		//add remove -- we dont require Explicit wait or Synchronization
		// To fetch or traverse arraylist we need Explicit Synchronization
		//1. Technique 
		List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Raj");
		nameList.add("Pratham");
		nameList.add("Shekhar");
		
		synchronized  (nameList){
			Iterator<String> var=nameList.iterator();
			
			while(var.hasNext()) {
				System.out.println(var.next());
			}
		
		//2. Technique
			
			//CopyOnWriteArrayList is a class
			// Its already Thread Safe and Synchronized
			
			
			CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<String>();
			
			empList.add("Raj");
			empList.add("Pratham");
			empList.add("Shekhar");
			
			Iterator<String> var1=empList.iterator();
			
			while(var1.hasNext()) {
				System.out.println(var1.next());
			}
			
		
			
		}
		
		

	}

}
