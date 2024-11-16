package Collection_Reflection.HashMAP.Storeobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class storeobjectInHaspMap {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>() ;
				
				al.add("asv");
				al.size();
				
				int [] a=new int[2];
				a[0]=1;
				
		Map<Integer, Employee> EmpMap=new HashMap<Integer, Employee>();
		EmpMap.put(1, new Employee(001,"Pratham",500000));
		EmpMap.put(2, new Employee(001,"Raj",200000));
		
		System.out.println(EmpMap);
		
		for(int i=1;i<=EmpMap.size();i++) {
			System.out.println(EmpMap.get(i).Empname);
		}
		
		for(Map.Entry t:EmpMap.entrySet()) {
			System.out.println(t.getValue());
		}
		
		int val1=EmpMap.get(1).EmpSalary;
		int val2=EmpMap.get(2).EmpSalary;
		
//		System.out.println(val1+val2);

	}

}

class Employee{
	
	int EmpId;
	int EmpSalary;
	
	String Empname;
	
	public Employee(int empId, String empname,int empSalary) {
		super();
		EmpId = empId;
		Empname = empname;
		EmpSalary = empSalary;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Empname=" + Empname +", EmpSalary=" + EmpSalary + "]";
//		return EmpId + ""+ EmpSalary;
		
	}
	
}
