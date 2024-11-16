package InterviewAssignments;

public class GetTextValuefromString {

	public static void main(String[] args) {
		
		String var="Raj@1Aaa,23";
		var=var.toUpperCase();
		//str = str.replaceAll("[-+^]*", " ");  //
		var=var.replaceAll("\\W", " "); //we can also use this regular expression to remove special character.
//		var=var.replaceAll("[^A-Z]","");
//		var=var.replaceAll("[^0-9]","");
//		var=var.replaceAll("\\d","");  //This will remove all numeric values from String 123
		System.out.println(var);
				
				
	}

}
