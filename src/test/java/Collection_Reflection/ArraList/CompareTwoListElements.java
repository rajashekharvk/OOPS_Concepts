package Collection_Reflection.ArraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoListElements {

	public static void main(String[] args) {
		
//		ArrayList<String> List1=new ArrayList<String>(Arrays.asList("D","C","A","E","B"));  
//		ArrayList<String> List2=new ArrayList<String>(Arrays.asList("D","C","A","E","B")); //"D","c","a","E","b","g"));
		
		//Sort the elenets
//		Collections.sort(List1); //only same kind Smaller Alphabet or uppercase it will work not for combination 
//		Collections.sort(List2);
//		System.out.println(List1.equals(List2));//true
		
		
	//2. Find out Additional elements in arrayLists
		
		ArrayList<String> List3=new ArrayList<String>(Arrays.asList("D","C","A","E","B","G"));  
		ArrayList<String> List4=new ArrayList<String>(Arrays.asList("D","C","A","E","B","F"));
		
//		List3.removeAll(List4);
//		System.out.println(List3); // return G
		
	// 3. return only common elements
		
		List3.retainAll(List4);
		System.out.println(List3);

	}

}
