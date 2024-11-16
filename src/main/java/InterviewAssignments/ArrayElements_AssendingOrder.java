package InterviewAssignments;

public class ArrayElements_AssendingOrder {

	public static void main(String[] args) {

		int array[] = { 7, 3, 1, 2, 9, 0, 6, 4, 5 };
		//String array1[] = { "Apple","Orange" };

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
	}

}
