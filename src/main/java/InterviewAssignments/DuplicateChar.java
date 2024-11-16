package InterviewAssignments;

import java.util.HashSet;

public class DuplicateChar {

	public static void main(String[] args) {

		
		String var = "ABABAB";
		HashSet <Character> hs=new HashSet <Character>();
		
		for(int i=0;i<var.length();i++) {
			char temp=var.charAt(i);
			if(!hs.contains(temp)) {
				hs.add(temp);
			}
		}
		for(char val:hs) {
			System.out.println(val);
		}
		
		
		/*
		String var = "ABABAB";
		
		char str[] = var.toCharArray();
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			int j = 0;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == i) {
				str[index++] = str[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(str, index))); 
		*/
		

	}

}
