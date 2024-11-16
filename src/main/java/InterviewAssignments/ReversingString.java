package InterviewAssignments;

import java.util.HashMap;
import java.util.Map;

public class ReversingString {
	//	Print your Name in Reverse Diretion and count no of repetative words in your name

	public static void main(String[] args) {
		String str = "Rajashekhar";
		String rev = "";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char charr[] = str.toCharArray();
		for (char var : charr) {
			rev = var + rev; // Name in Reverse Diretion
			if (hm.containsKey(var))
				hm.put(var, hm.get(var) + 1); // count no of repetative char in your name
			else
				hm.put(var, 1); // Add words in your name in case its not in HashMap Collection
		}
		
		System.out.println("Name in Reverse Direction --->" + rev.toUpperCase() + "\n");
		
		for (Map.Entry<Character, Integer> val : hm.entrySet()) {
			System.out.println("Character --->" + val.getKey() + " Count of ---> " + val.getValue());
		}
	}
}
