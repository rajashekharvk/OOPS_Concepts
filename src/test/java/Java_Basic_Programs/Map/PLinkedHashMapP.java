package Java_Basic_Programs.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 	2. Linked Hash Map: 
	The underlying data structure is Hash table. Duplicate keys are not allowed, duplicate values are allowed, 
	and insertion order is preserved.
 */

public class PLinkedHashMapP {

	public static void main(String[] args) {

		Map<Integer, String> h= new LinkedHashMap<>();
		Map<Integer, String> h1= new HashMap<>();
		h.put(2, "john");
		h.put(1, "Mike");
		h.put(10, "Adam");
		h.put(5, "Sam");
		h.put(2, "Raj");
		
		
		for(Map.Entry obj:h.entrySet()) {
			System.out.println(obj.getKey()+"\t"+obj.getValue());
		}
				
	}

}
