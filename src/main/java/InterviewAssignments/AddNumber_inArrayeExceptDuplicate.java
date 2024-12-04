package InterviewAssignments;

import java.util.HashSet;
import java.util.TreeSet;

public class AddNumber_inArrayeExceptDuplicate {

	public static void main(String[] args) {
		// {5,1,8,4,9,1,5} = 27

				int[] arr = {5,1,8,4,9,1,5};
				int sum = 0;
				
//				Method_1		
				TreeSet<Integer> ts=new TreeSet<Integer>();
				
				for (int i = 0; i < arr.length; i++) {
					ts.add(arr[i]);
					
				}
				for(Integer a:ts) {
					sum=sum+a;
				}
				System.out.println(sum);
				
//				Method_2
				
				HashSet<Integer> hs=new HashSet<Integer>();
				
				for (int i = 0; i < arr.length; i++) {
					hs.add(arr[i]);
					
				}
				for(Integer a:hs) {
					sum=sum+a;
				}
				System.out.println(sum);
				
				
//				Method_3
				
				boolean flag;

				for (int i = 0; i < arr.length; i++) {
					flag = false;
					for (int j = 0; j < arr.length; j++) {

						if (i == j) {
							flag = false;
							break;
						}

						if (arr[i] == arr[j] ) {
							flag = true;
							break;
						} 

					}
					if (!flag) {
						System.out.println(arr[i]);
						sum = sum + arr[i];
					}

				}

				System.out.println("sum is  " + sum);
	}

}
