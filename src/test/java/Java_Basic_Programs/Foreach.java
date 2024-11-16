package Java_Basic_Programs;

/*
 * 	Note:
	1.If the size is known ,then we have to use for loop.
	2. Whenever size is unknown, then we have to use for each loop.
      Syntax:
        for (data type variable: Array/collection)
               {}

 */

public class Foreach {

	public static void main(String[] args) {

		
		String s="i am learing Java";
		String s1[]=s.split("\\s");
		for(String  obj:s1) {
			System.out.println(obj);
		}
	}

}
