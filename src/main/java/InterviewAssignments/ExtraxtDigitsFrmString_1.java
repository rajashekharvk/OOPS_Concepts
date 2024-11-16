package InterviewAssignments;

public class ExtraxtDigitsFrmString_1 {

	public static void main(String[] args) {

		String var="find3the4sum5@@";
		int temp=0;
		for(int i=0;i<var.length();i++) {
			char c=var.charAt(i);
			boolean b=Character.isDigit(c);
			if(b==true) { 
				int j = Character.getNumericValue(c);
				temp=temp+j;
			}
		}
		
		System.out.println(temp);		
	}

}

class Test {

	public static void main(String[] args) throws InterruptedException {
		
		/*String a[]={"7sad9","hgds99","hfd78"}
		 
		Find the sum of the integers?
		o/p: 79+99+78=256 */
		
		
		String a[]={"7sad9","hgds99","hfd78"};
//		String a[]={"7sad9"};
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
