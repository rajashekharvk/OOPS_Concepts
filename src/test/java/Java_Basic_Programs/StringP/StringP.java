package Java_Basic_Programs.StringP;

/*
 * 	STRING:
	1. String is a non-primitive data type.
	2. String is a final class, which is present in java. Lang package.
	3. Strings are immutable i.e. once if the content is fix we can’t modify the content of String.
 */

public class StringP {

	public static void main(String[] args) {
		
		String s1="Shushma";
		String s2="Pratham";
		String s8="";
		s8=s1.concat(s2);
		
		
		System.out.println(s8);
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toUpperCase());
	/*	
		System.out.println(s1.length());
		System.out.println(s1.startsWith("S"));
		System.out.println(s1.endsWith("a"));
		
		System.out.println(s1.replace("s","P"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf("u"));
		System.out.println(s1.substring(2, 6));
		System.out.println(s1);
		System.out.println(s1.trim());
		
			
		char s3[] =s1.toCharArray();
		for (char obj:s3) {
			System.out.print(obj);
			System.out.print("\t");
		}
		*/
		
		
		
		
	}

}
