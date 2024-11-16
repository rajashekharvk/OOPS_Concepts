package Collection_Reflection.HashMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//1. On the basis of key-Value use equals method
		System.out.println(map1.equals(map2)); //true
		System.out.println(map1.equals(map3)); //false
		
		//2. Compare hashMap for the same keys using KeySet method
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		System.out.println(map1.keySet().equals(map3.keySet())); ////true
		
		//3. combine the keys from both the maps using  HashSet and find Extra Key 
		HashMap<Integer, String> map4=new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		HashSet<Integer> combineKeys=new HashSet<Integer>(map1.keySet());
		
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys); //[4]
		
		//Compare map values using Arrays (Arrays will allow duplicate values)
		HashMap<Integer, String> map5=new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6=new HashMap<Integer, String>();
		map6.put(3, "C");
		map6.put(1, "A");
		map6.put(2, "B");
		
		HashMap<Integer, String> map7=new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		//Duplicate values allowed in arrayList
		ArrayList<String> arr1=new ArrayList<String>(map6.values());
		ArrayList<String> arr2=new ArrayList<String>(map7.values());
		
		System.out.println(arr1); //[A, B, C]
		System.out.println(arr2); //[A, B, C, C]
		
		System.out.println(arr1.equals(arr2)); //false
		
		//Duplicate Values are not allowed in hashSet
		HashSet<String> hs1= new HashSet<String>(map5.values());
		HashSet<String> hs2= new HashSet<String>(map7.values());
		System.out.println(hs1); //[A, B, C]
		System.out.println(hs2); //[A, B, C] ingnored last key -4 value C
		
		System.out.println(hs1.equals(hs2)); //true
		
		
		
		
		

	}

}
