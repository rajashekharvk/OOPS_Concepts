package Collection_Reflection.ArraList;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		//a{1,2,3,4};
		//int x[] = new int[5];
		
//		List <String>l=new ArrayList<String> ();
		List l=new ArrayList ();
		l.add("Apple");
		l.add("Orange");
		l.add(100);
		
		System.out.println(l.size());
//		for(String s:l) {
//			System.out.println(s);
//		}
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			
		}
		
		Hashtable <String,String> table=new Hashtable  <String,String>();
		table.put("name","Raj");
		table.put("name1","Pratham");
		
//		System.out.println(table.get("name1"));
		table.keySet();
		
		
		
	}
	
	
	

}
