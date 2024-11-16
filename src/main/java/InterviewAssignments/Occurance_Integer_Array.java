package InterviewAssignments;

import java.util.HashMap;
import java.util.Map;

/*
 * // Create java program Input Integer Array - {4,1,2,3,2,1,4,} Create one method
		// in java with name public int[] uniqueElements(int ar[]); output: {4,1,2,3}
 */

public class Occurance_Integer_Array {
	
	public static void main(String[] args) {

		int arr[] = { 4, 1, 2, 3, 2, 1, 4 }; //
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (mp.containsKey(arr[i])) {
				
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		
		
		
		for (Map.Entry<Integer, Integer> obj : mp.entrySet()) {
			System.out.println("Key is  --- " + obj.getKey() + "No. of count is --- " + obj.getValue());
		}

}
	
}
