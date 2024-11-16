package InterviewAssignments.ObjectCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsforEmployee {

	public static void main(String[] args) {

		/*
		 * EmployeeID, EmployeeSalary,Location Set1 EmployeeID =123 EmployeeSalary =5000
		 * Location =Bangalore
		 * 
		 * Set2 EmployeeID =124 EmployeeSalary =6000 Location=Hydrabad
		 * 
		 * Set2 EmployeeID =125 EmployeeSalary =7000 Location=Chennai
		 * 
		 */
		Student s1 = new Student("1", "5000", "Bangalore");
		//Student s2 = new Student("2", "6000", "Hydrabad");
//		Student s3 = new Student("3", "7000", "Chennai");

		List<Student> l = new ArrayList<Student>(Arrays.asList(s1));
		//HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		
		for (Student s : l) {
			System.out.println(s.getEmployeeID());
		}

//		for (Student s : l) {
//			if (hm.containsKey(s.EmployeeID)) {
//				hm.get(s.EmployeeID).add(s.EmployeeSalary + "-" + s.EmployeeLocation);
//			} else {
//				hm.put(s.EmployeeID, new ArrayList<String>());
//				hm.get(s.EmployeeID).add(s.EmployeeSalary + "-" + s.EmployeeLocation);
//			}
//		}
//		String var="";
//		for(Map.Entry c:hm.entrySet()) {
//			System.out.println(c.getKey()+"  "+c.getValue());
//			 var=c.getValue().toString();
//			 System.out.println(var);
//				int splitIndex = var.indexOf("-");
//				if(splitIndex!=-1) {
//					String leftside = var.substring(0,splitIndex);
//					System.out.println("Sundeep"+leftside);
//			
//		}
//		
//		}
////		String[] arr=var.split("-");
////		System.out.println(arr[0]);
////		String a=arr[0];
////		a=a.replaceAll("[","");
////		System.out.println(a);
////		
//		
////			        System.out.println(hm); 
//		
//		String[] valArray= hm.values().toArray(new String[0]);
		
//		System.out.println("------------------------");
//		for(String b:valArray) {
//			System.out.println(b);
//		}
		
//		for (Map.Entry val : hm.entrySet()) {
//			System.out.println(val.getKey());
////			System.out.println(val.getValue());
//		}

	}
}
