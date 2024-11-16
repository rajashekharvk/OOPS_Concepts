package InterviewAssignments;

public class ExtraxtDigitsFrmString_2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*String a[]={"7sad9","hgds99","hfd78"}
		 
		Find the sum of the integers?
		o/p: 79+99+78=256 */
		
		String a[]={"7sad9","hgds99","hfd78"};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			String str=a[i];
			str=str.replaceAll("[^0-9]","");
			int c=Integer.parseInt(str);
			sum=sum+c;
		
	}
		System.out.println(sum);

}
}