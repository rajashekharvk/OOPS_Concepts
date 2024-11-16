package InterviewAssignments;

public class ReversewordInSentence_1 {

	public static void main(String[] args) {
		String var="My name is Rajshekhar"; // 
		String[] strarr=var.split(" ");
		String temp="";
		String sReversewordInSentence="";
		for(String word:strarr) {
			for(int i=0;i<word.length();i++) {
				temp=word.charAt(i)+temp;
			}
			sReversewordInSentence=sReversewordInSentence+" "+temp;
			temp="";
		}
		System.out.println(sReversewordInSentence); 
	}

}
