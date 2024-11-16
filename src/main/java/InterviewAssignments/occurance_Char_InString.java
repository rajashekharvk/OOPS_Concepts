package InterviewAssignments;

import java.util.HashMap;
import java.util.Map;

public class occurance_Char_InString {
	public static void main(String[] args) {
		String str="ABABABA ewevbbeevwe ANBABAB";
		char carr[]=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		for(char c:carr) {
			if(c !=' ') {
				if(hm.containsKey(c)) {
					hm.put(c, hm.get(c)+1);
				}else {
					hm.put(c, 1);
				}
			}
		}
		
		for(Map.Entry<Character, Integer> val:hm.entrySet()) {
			System.out.println("Char is "+ val.getKey()+ "count is "+ val.getValue());
		}
				
	}

}
