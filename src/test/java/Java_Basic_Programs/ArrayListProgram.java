package Java_Basic_Programs;

import java.util.ArrayList;



public class ArrayListProgram {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();  //its called Non generic object: 
		a.add(5);
		a.add("rashda");
		a.add('a');
		a.add(20.0);
		a.add(5);
		System.out.println(a);
		System.out.println("--------------------");
		for(Object obj:a) {
		System.out.println(obj);
		}
		}
}
