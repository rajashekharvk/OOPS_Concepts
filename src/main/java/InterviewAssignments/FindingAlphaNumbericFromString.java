package InterviewAssignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingAlphaNumbericFromString {

	public static void main(String[] args) {

		// condition alphanumeric word
		// it may start with integer or alphabet

		String str = "your otp is 123b1 donot share 234cvss434";

		String[] arrstr = str.split(" ");
		String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";

		for (int i = 0; i < arrstr.length; i++) {

			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(arrstr[i]);
			if (m.matches()) {
				System.out.println(arrstr[i]);
			}
		}
	}

}
