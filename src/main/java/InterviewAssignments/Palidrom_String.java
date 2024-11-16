package InterviewAssignments;

public class Palidrom_String {

	public static void main(String[] args) {
		String str="GADAG";
		String temp="";
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			temp=a+temp;
		}
		if(str.equals(temp))
			System.out.println("The String is palidrom  "+temp);
		else
			System.out.println("The String is NOT palidrom  "+temp);

	}

}
