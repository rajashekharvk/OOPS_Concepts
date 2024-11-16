package InterviewAssignments;

import java.util.HashMap;
import java.util.Map;

public class ausingzMethod {
	
	public static void main(String[] args) {
		
		ausingzMethod obj=new ausingzMethod();
//		obj.fun();
		Integer [] arr=obj.fun();
		System.out.println("Printing from called main method");
		for(int i=0;i< arr.length;i++) { //(int i=0;i< obj.fun().length;i++)  we call like this also but for each iteration it will call the function
			System.out.println(arr[i]);
//			System.out.println(obj.fun()[i]);
		}
	}
	
	public Integer[] fun() {
	Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
	
	int arr[] = { 4, 1, 2, 3, 2, 1, 4 }; 
	
	for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
	
//	for (Map.Entry<Integer, Integer> obj : mp.entrySet()) {
//		System.out.println("Key is  --- " + obj.getKey() + "No. of count is --- " + obj.getValue());
//	}
	
	System.out.println("----------------");
	
//	Collection<Integer> values=mp.values();
//	Integer[] valArray=values.toArray(new Integer[0]);
	
	Integer[] valArray=mp.values().toArray(new Integer[0]);
	
	//Integer[] keyArray= mp.keySet().toArray(new Integer[0]);
	
//	for(int i=0;i<keyArray.length;i++) {
//		System.out.println(keyArray[i]);
//	}
	
	return valArray;
	
	}
}