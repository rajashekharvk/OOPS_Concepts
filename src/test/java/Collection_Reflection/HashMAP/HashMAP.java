package Collection_Reflection.HashMAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMAP {

	public static void main(String[] args) {
		
		//No order not indexing
		//stores values in the form of keys and value
		//Key cannot be duplicate
		//can store N number of null values but we store only one null KEY
		//hashmap is not thread-safe and notSynchronize
		
		HashMap<String, String> capitalMap= new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("Rassia", null);
		capitalMap.put("Pakistan", null);
		capitalMap.put(null, "value1");
		capitalMap.put(null, "value2");  //value2 will over write on value1
//		capitalMap.put(null, 123);
		
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get(null));
		
		System.out.println("------------------------");
		
		Iterator<String> it=capitalMap.keySet().iterator();
//		Iterator it2=capitalMap.keySet().iterator();
			
		while(it.hasNext()) {
			String key=it.next();
			String value=capitalMap.get(key);
			
			System.out.println("Key is "+key+"  value is "+value);
			
			//OR
//			Map.Entry pairs =(Map.Entry)it2.next(); //you cannot define data type here like String, Integer
//			System.out.println("Get key is "+pairs.getKey()+" get value is "+pairs.getValue());
			
		}
		
		System.out.println("------------------------");
		Iterator<Entry<String, String>> it1=capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> set=it1.next();
			System.out.println("Key is "+set.getKey()+"value is "+set.getValue());
			
			//Using Java 8 and for each lambda
			capitalMap.forEach((k,v) -> System.out.println("Key is "+k+" value is "+v));
		}
		

	}

}
