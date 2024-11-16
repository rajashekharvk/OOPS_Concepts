package Collection_Reflection.HashMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class convertHashMaptoArrayList {

	public static void main(String[] args) {
		
		HashMap<String,String> map1=new HashMap<String,String>();
		
		map1.put("India", "New Delhi");
		map1.put("USA", "Washington DC");
		map1.put("Rassia", null);
		map1.put("Pakistan", null);
		map1.put(null, "value1");
		map1.put(null, "value2");
		
		
		//Convert May  keys into ArrayList
		List<String> arr1=new ArrayList<String>(map1.keySet());
		
		System.out.println(arr1);
		
		//Convert May  values into ArrayList
		List<String> arr2=new ArrayList<String>(map1.values());
		
		System.out.println(arr2);
		
		for(String s:arr2)
		{
			System.out.println(s);
		}

	}

}
