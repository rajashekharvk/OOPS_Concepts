package InterviewAssignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateelementsInString {

	public static void main(String[] args) {

		String str = "monday tuesday monday, tuesday tuesday sunday";
		HashMap<String, Integer> hp = new HashMap<String, Integer>();
		System.out.println(str);   // monday tuesday monday, tuesday tuesday sunday
		str = str.replaceAll("\\W", " ");
		System.out.println(str);               //monday tuesday monday  tuesday tuesday sunday
		String[] astr = str.split(" ");
		System.out.println(Arrays.toString(astr));  //[monday, tuesday, monday, , tuesday, tuesday, sunday]

		for (String c : astr) {
			if (!c.isBlank()) {
				if (hp.containsKey(c)) {
					hp.put(c, hp.get(c) + 1);
				} else {
					hp.put(c, 1);
				}
			}
		}
		for (Map.Entry<String, Integer> val : hp.entrySet()) {
			//int a=(int) val.getValue();
			String b=(String)val.getKey(); 
			System.out.println(b); //monday, tuesday, monday,tuesday, tuesday, sunday
			
//			if(a!=1) {
//			System.out.println(val.getKey() + " ----------------->" + val.getValue());
//			}
		}
	}

}
