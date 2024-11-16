package InterviewAssignments;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
       HashMap<String,String> mp=new HashMap<String,String>();
		mp.put("Karnataka",	 "Bangalore");
		mp.put("Tamil Nadu",	 "Chennai");
		mp.put("Rajasthan",	 "Jaipur");
		for(Map.Entry<String,String> val : mp.entrySet()){
		    System.out.println(val);
		}
		System.out.println(mp.size());
		if(mp.containsValue("Jaipur")) {
			System.out.println("True");
		}
		if(mp.containsKey("Karnataka")) {
			System.out.println("True");
		}
    }
}