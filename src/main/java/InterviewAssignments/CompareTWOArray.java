package InterviewAssignments;
import java.util.HashSet;

public class CompareTWOArray {

	/*
	  	Compare the below 2 arrays and findout the Matched Elements & UnMatched Elements
		int array3[]={9,4,6,0,5,8}
		int array4[]={7,3,1,2,9,0,6}
		Output should be:
		===================
		Matched   Elements: 0,6,9
		UnMatched Elements: 1,2,3,4,5,8
	 */

	public static void main(String[] args) {

		int arr1[]= {9,4,6,0,5,8};
		int arr2[] ={7,3,1,2,9,0,6};
		boolean isfound = false;

		/*
			TreeSet list=new TreeSet(); //insertion order is not preserved means data will sort and stored here
			TreeSet list1=new TreeSet();

			ArrayList list=new ArrayList();  //Duplicate values are allowed hence we cannot use this
			ArrayList list1=new ArrayList(); //Its Non Generic Object
			Non Generic Object 
			Allows both homogeneous and heterogenous value
			
			Generic Object
			Allows only homogeneous value
		 */


		HashSet<Integer>list=new HashSet<Integer>();  //insertion order is not preserved means data will sort and stored here
		HashSet<Integer> list1=new HashSet<Integer>();  //Its called  genric Object

		//Verifying 1st array i.e arr1
		for(int i = 0; i < arr1.length ; i++){ 
			isfound = false;
			for(int j = 0; j < arr2.length; j++) 
			{ 
				if(arr1[i]== arr2[j] ) {
					isfound = true;
					break; }
				else 
					isfound=false;
			}
			if(isfound) 
				list.add(arr1[i]);
			else 
				list1.add(arr1[i]);
		}

		//	Verifying 2nd array i.e arr2
		for(int i = 0; i < arr2.length; i++){ 
			isfound = false;
			for(int j = 0; j < arr1.length; j++) { 
				if(arr2[i]== arr1[j]) {
					isfound = true;
					break; }
				else 
					isfound=false;
			} 
			if(isfound) 
				list.add(arr2[i]);
			else if(!isfound)
				list1.add(arr2[i]);
		}
		System.out.println("MATCHED Values in two Arrays");
		for(int val:list) {
			System.out.print(val+"\t");
		}
		
		System.out.println("\n"+"NOT MATCHED Values in two Arrays");
		for(int val:list1) {
			System.out.print(val+"\t");
		}
	/*
		Iterator<Integer> it=list.iterator();
		System.out.println("MATCHED");
		while(it.hasNext())
			System.out.print(it.next()+"\t");

		Iterator<Integer> it1=list1.iterator();
		System.out.println("\n"+"NOT MATCHED");
		while(it1.hasNext())
			System.out.print(it1.next()+"\t");
	*/
	}

}
