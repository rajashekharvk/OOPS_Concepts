package InterviewAssignments;

import java.util.TreeSet;

public class FindNotDuplicateElementArray {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 3, 7, 2, 1, 4 };

		boolean flag;
		TreeSet<Integer> sh = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] & i != j) { // mp.containsKey(arr[i])) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				sh.add(arr[i]);
			}
		}

		for (int obj : sh) {
			System.out.println("Key is  --- " + obj);
		}
	}
}
