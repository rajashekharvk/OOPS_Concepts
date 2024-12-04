package InterviewAssignments;

import java.util.HashMap;

public class OvalLettersCount {
	public static void main(String[] args) throws InterruptedException {

		String str = "waeqwfwvedgfquuwfiovaiioooavwu";
		str = str.toUpperCase();
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		for (char a : arr) {
			if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
				if (hp.containsKey(a)) {
					hp.put(a, hp.get(a) + 1);
				} else {
					hp.put(a, 1);
				}
			}
		}
		System.out.println(hp);
	}
}