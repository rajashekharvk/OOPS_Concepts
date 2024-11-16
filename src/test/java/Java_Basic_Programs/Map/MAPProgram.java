package Java_Basic_Programs.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Map:
	Map is an interface which is present in java.util package. If we want to represent collection of individual object as a key value pair 
	then we should go for map interface.
	
	Syntax: Map<key, value>
            Key is an object, value is an object, duplicate keys are not allowed, and duplicate values are allowed.
	
	1. Hash Map: 
		The underlying data structure is Hash table. Duplicate keys are not allowed. However, duplicate values are allowed, 
		insertion order is not preserved i.e. we can’t maintain the order.
 */

public class MAPProgram {

	public static void main(String[] args) {

		HashMap<Integer, String> h= new HashMap<>();
		h.put(2, "john");
		h.put(1, "Mike");
		h.put(10, "Adam");
		h.put(5, "Sam");
		h.put(2, "Raj");
		
		
		for(Map.Entry obj:h.entrySet()) {
			System.out.println(obj.getKey()+"\t\t"+obj.getValue());
			
		}
		
		HashMap<String, String> h1=new HashMap<>();
		h1.put("Key2", "Value2");
		h1.put("Key4", "Value4");
		h1.put("Key3", "Value3");
		h1.put("Key1", "Value1");
		
		HashMap<Integer, Integer> h5=new HashMap<>();
		h5.put(1, 1);
		
		for(Map.Entry obj:h1.entrySet()) {
			System.out.println(obj.getKey()+"\t"+ obj.getValue());
		}
	}

}
