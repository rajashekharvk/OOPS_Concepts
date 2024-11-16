package Collection_Reflection.ArraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> nameList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1,6,7,8,9,9,8,7,6,5));
		
				//1. technique using LinkedhashSet
				
				LinkedHashSet<Integer> LnkedHashSet=new LinkedHashSet<Integer>(nameList);
				
				System.out.println(LnkedHashSet); //[1, 2, 3, 4, 6, 7, 8, 9, 5]
				
				ArrayList<Integer> nmeList=new ArrayList<Integer>(LnkedHashSet);
				System.out.println(nmeList);//[1, 2, 3, 4, 6, 7, 8, 9, 5]
				
				//2nd Technique using JDK 8 Version
				//Stream is method to streamline arrayList and return object string
				//distict is a method to remove duplicate values and store 
				// Collect is method to collect values as a list or map Set
				
				ArrayList<Integer> nameList1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1,6,7,8,9,9,8,7,6,5));
				
				List<Integer> namelist2=nameList1.stream().distinct().collect(Collectors.toList());
				System.out.println(namelist2);  //[1, 2, 3, 4, 6, 7, 8, 9, 5]
		
		

	}

}
