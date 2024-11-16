package InterviewAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class DuplicateString {

	public static void main(String[] args) {

		String[] astr1 = { "Dh", "Ba", "Ca" };
		String[] astr2 = { "Ga", "Za", "Eh", "Fa", "Ha" };

		//only to sort the data in array
		// Arrays.sort(astr2);
		for (String a : astr2) {
			System.out.print(a + "\t");
		}
		System.out.println("\n");
		
		// 1nd Method
		TreeSet<String> arr1 = new TreeSet<String>(Arrays.asList(astr1));
		TreeSet<String> arr2 = new TreeSet<String>(Arrays.asList(astr2));
		arr1.addAll(arr2);
		System.out.println(arr1);

		// 2rd method
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(astr1));
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList(astr2));
		ar.addAll(ar1);
		Collections.sort(ar);
		System.out.println(ar);

		//finding duplicate word in sentance
		HashSet<String> hm = new HashSet<String>();
		String s = "I am a java developer and I am proud of it";
		String[] strarr = s.split(" ");
		for (int i = 0; i < strarr.length; i++) {
			String temp = strarr[i];
			for (int j = 0; j < strarr.length; j++) {
				if (temp.equals(strarr[j]) & i != j) {
					hm.add(temp);
				}
			}
		}

		System.out.println(hm);

	}

}
