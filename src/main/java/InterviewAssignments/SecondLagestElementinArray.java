package InterviewAssignments;

public class SecondLagestElementinArray {

	public static void main(String[] args) {
//		Method 1
/*		Integer[] arr= {10,1,8,6,2,3,4,5,7,9};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[1]);
	*/	
		
//	Method 2
		Integer[] arr= {10,1,8,6,2,3,4,5,7,9};
		int temp=0,temp2=0,index=0;
		for(int i=0; i< arr.length;i++) {
			for(int j=i+1; j< arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				index=i;
			}
		}
		temp2=	arr[index];	
		System.out.println(index);
		System.out.println("2nd Largest number in the array is "+temp2);
		
		
	}

}
