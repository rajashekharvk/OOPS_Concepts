package Java_Basic_Programs.StringP;

import java.util.ArrayList;

/*
 * 	Difference between String Buffer & String builder:
String Buffer	
1. String buffer is mutable.
2. String buffer is Synchronized.
3. String buffer is single threaded.
4. String buffer is thread safe.
5. String buffer is slower.	

String buffer
1. String builder is mutable.
2. String builder is not Synchronized.
3. String buffer is multi-threaded.
4. String builder is not thread safe.
5. String builder is faster.

Compare to () method:
1. If both the strings are equal it returns 0.
2. If the first string is greater than second one it returns positive value.
3. If the first string is less than second string it returns negative value.

Questions:
1.What is String?
A. A string is a data type used in programming, that is used to represent text rather than numbers.
 	A string is a sequence of characters and can contain letters, numbers, symbols and even spaces. 
	It must be enclosed in quotation marks for it to be recognized as a string.
	
2. Does String are mutable or immutable? If it is mutable explain the concept of immutable?
A. In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.
 	Once String object is created its data or state can't be changed but a new String object is created.
 	
 	Mutable - . To create mutable strings that can be changed, the StringBuilder() and StringBuffer() classes are used.
 	
3. Difference b/w String, String buffer, String Builder?
A. String is immutable whereas StringBuffer and StringBuilder are mutable classes. StringBuffer is thread-safe and synchronized
 whereas StringBuilder is not. That's why StringBuilder is faster than StringBuffer. String concatenation operator (+)
  internally uses StringBuffer or StringBuilder class.
  
4. Explain inbuilt methods in String class?
5. How many ways is there to create a string object?
String literals, by using new keyword
6. Difference b/w double equal, equals () method and compare to () method?
	double equal
	checks with reference of the object are same or not.
	equals() checks 
	if two objects are the same or not and returns a boolean. 
	compareTo() (from interface Comparable) returns an integer. It checks which of the two objects is "less than", "equal to" or "greater than"
	 the other.
7. Difference b/w hash code and equals () method?
	Java hashCode()
	An object hash code value can change in multiple executions of the same application. 
	If two objects are equal according to equals() method, 
	then their hash code must be same. If two objects are unequal according to equals() method, their hash code are not required to be different.
8. Difference b/w String buffer, String Builder?

 */

public class StringBuilderP {

	public static void main(String[] args) {
		
		System.out.println("---------String Buffer-------");
		
		StringBuffer s1= new StringBuffer("abc");
		StringBuffer s2 = new StringBuffer("qert");
		s1.append(s2);
		System.out.println(s1);
		
		
		System.out.println("---------String Builder-------");
		StringBuilder s3=new StringBuilder("abc");
		StringBuilder s4= new StringBuilder("qert");
		s3.append(s4);
		System.out.println(s3);
		
		System.out.println("------concat------");
		String s5="abc";
		String s6="abc"; //"qert";
		s5.concat(s6);
		System.out.println(s5);
		
		System.out.println("Difference between (==), equal () method and compare to () method?");
		if(s5==s6) {
			System.out.println("");
		}else {
			System.out.println("not match");
		}
		
		
		System.out.println("---------Value of--------");
		
		char [] a= {'a','b','c'};
		
		String b=new String(a);
		System.out.println(b.valueOf(a[2])); //its valueof is static method so need to call with String Class
		
		
		
		
		
	}

}
