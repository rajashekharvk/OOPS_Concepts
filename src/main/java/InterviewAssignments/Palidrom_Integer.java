package InterviewAssignments;

public class Palidrom_Integer {

	public static void main(String[] args) {

		int num=121;
		int rem=0,given=0;
		String sum="";
		given=num;
		rem=given%10;
		while(rem!=0) {
			sum=sum + rem;
			given=given/10;
			rem=given%10;
		}
		int rev=Integer.valueOf(sum);
		if(num==rev) 
			System.out.println("Is Palidrom "+rev);
		else
			System.out.println("Is NOT Palidrom "+rev);
		
		
		
		
	}

}
