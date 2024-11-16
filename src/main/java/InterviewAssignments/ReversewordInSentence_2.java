package InterviewAssignments;

public class ReversewordInSentence_2 {

	public static void main(String[] args) {

		String str = "This is sample code";

		// OUTPUT EXPTECTED
//		============================
//		edoc This is sample
//		elpmas edoc This is
//		si elpmas edoc  This
//		sihT si elpmas edoc  
//		============================

		String temp = "";
		String strSentance = "";
		String strFinallOutPutExp = "";

		String[] arr = str.split(" ");

		for (int j =(arr.length)-1; j >= 0; j--)
		{
			for (int i = 0; i < arr[j].length(); i++)
			{
				char a = arr[j].charAt(i);
				temp = a + temp;
			}
			
			strFinallOutPutExp = temp + " " + strFinallOutPutExp;
			
			for (int k = 0; k < j; k++)
			{
				strSentance = strSentance + " " + arr[k];
			}
			
			System.out.println(strFinallOutPutExp + "" + strSentance);
			temp = "";
			strSentance = "";
		}
	}

}
