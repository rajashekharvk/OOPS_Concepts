package InterviewAssignments;

public class FindEvenNumberWordFrmString {

	public static void main(String[] args) {
		String str="i am giving bangalor in capco interview  abcd test12";
	    String maxLenEvenWord = "";
	    String[] words = str.split(" ");
	    for (int i = 0; i < words.length; i++) {
	        String word = words[i];
	        if (word.length() % 2 == 0 && word.length() > maxLenEvenWord.length()) {
	            maxLenEvenWord = word;
	        }
	    }
	    
	    System.out.println("Max Even number -> "+maxLenEvenWord.length()+"  The word is -> "+maxLenEvenWord);
	}

}
