package InterviewAssignments;

public class ArrayElements_DescendingOrder {

	public static void main(String[] args) {

		int array[] = { 7, 3, 1, 2, 9, 0, 6, 4, 5 };
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
			System.out.println(array[i]);
		}
		
		/*
		 *for (int a : array) {
			System.out.println(a); //using for each also we can print
		}*/
		
		
	}

}
