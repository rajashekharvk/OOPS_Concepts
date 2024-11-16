package Collection_Reflection.HashMAP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SplitCountDuplicatewords {

	public static void main(String[] args) {

		//		how many words are repeated
		//		count of repated words

		String var = "monday tuesday monday,tuesday tuesday sunday ";

		HashMap<String, Integer> hp = new HashMap<String, Integer>();

		var = var.replaceAll("\\W", " ");
		var = var.trim();
		String[] arrStr = var.split(" ");
		System.out.println(Arrays.toString(arrStr));

		for (String val : arrStr) {
			val=val.trim();
			if (hp.containsKey(val)) {
				hp.put(val, hp.get(val) + 1);
			} else {
				hp.put(val, 1);
			}
		}

		for (Map.Entry val : hp.entrySet()) {

			int b = (int)val.getValue() ;
			if (b != 1) {
				System.out.println(val.getKey() + " ----------> " + val.getValue());
			}
		}
	}

}
