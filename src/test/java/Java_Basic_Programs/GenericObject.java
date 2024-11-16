package Java_Basic_Programs;

import java.util.ArrayList;

/*
 * 	I.Q: How to make collection classes as a homogeneous?
	Ans: 1.By using generic object.
	2. Non generic object allows both homogeneous and heterogeneous value. But generic object allows only homogeneous value.
	
	Note:
	1.If the size is known ,then we have to use for loop.
	2. Whenever size is unknown, then we have to use for each loop.
      Syntax:
        for (data type variable: Array/collection)
               {
                                                }


 */

public class GenericObject {

	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<Integer>();  //Its called Generic Object
		
		a.add(4);
		a.add(10);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
	}

}
