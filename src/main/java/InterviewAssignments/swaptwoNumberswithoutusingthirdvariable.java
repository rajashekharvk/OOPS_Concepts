package InterviewAssignments;

public class swaptwoNumberswithoutusingthirdvariable {

	public static void main(String[] args) {

		int a = 40;
		int b = 50;
		
		a = a + b; //40+50 =90
		b = a - b;  //90-50=40
		a = a - b;  //90-40=50

		System.out.println(a + "  " + b);

	}

}
