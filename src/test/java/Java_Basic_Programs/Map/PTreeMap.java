package Java_Basic_Programs.Map;

import java.util.Map;
import java.util.TreeMap;

/*
 * 	3. Tree Map:
 	Duplicate keys are not allowed, duplicate values are allowed, insertion order is not preserved 
 	all the elements are sorted according to ascending order.
 	
 	Note:
	1.Put () method:
 		It is a method used to add object to the map interface
	2. Enter Set (): 
		It is a method used to iterate the object from map interface.
	3. Map is an interface; Entry is a sub interface of Map interface.
	4. getkey () and get value () methods are available inside map.Entry.
	5. getkey () is a method which is used to get all the keys.
	6. getvalue() is a method used to get all the values.
 */

public class PTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> h = new TreeMap<>();
		h.put(2, "john");
		h.put(1, "Mike");
		h.put(10, "Adam");
		h.put(5, "Sam");
		h.put(1, "pqr");
		h.put(7, "abc");

		for(Map.Entry obj:h.entrySet()) {
			System.out.println(obj.getKey()+"\t"+obj.getValue());
		}
		
	}

}
