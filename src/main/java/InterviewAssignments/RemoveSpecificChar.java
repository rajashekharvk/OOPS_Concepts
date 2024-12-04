package InterviewAssignments;

import java.util.Arrays;
import java.util.Collections;

//Online Compilor
//https://onecompiler.com/java/42z6p4mb9

public class RemoveSpecificChar {

	public static void main(String[] args) {

			String str ="Hello, World!";
			
//			Out Put
//			revrse string 
//			no ovals
//			!dlrW ,llH
			
			String rev="";
	//Method 1		
			
			for(int i=0;i<str.length();i++) {
				char a=str.charAt(i);
				if(a !='e' & a!='o') {
					rev=a+rev;
				}
			}
			
			System.out.println(rev);
			System.out.println("=================================");
			rev="";
			
//			Method 2
//			rev=rev.replaceAll("[e,E]", "");
//			rev=rev.replaceAll("o", "");
			
//			System.out.println(rev);
			
			
//			Method 3
			String[] arr = str.split(" ");
			String temp="";
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println(Arrays.toString(arr));
			System.out.println(arr[0] + "  " + arr[1]);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length(); j++) {
					char a = arr[i].charAt(j);
					if (a != 'e' & a != 'o') {
						temp = a+temp  ;
					}
				}
				
				rev=rev+" "+temp;
				temp="";
			}
			System.out.println(rev);
	}

}
