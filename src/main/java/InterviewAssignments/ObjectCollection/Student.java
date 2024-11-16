package InterviewAssignments.ObjectCollection;

public class Student {
	
	String EmployeeID;
	String EmployeeSalary;
	String EmployeeLocation;
	
	public Student(String EmployeeID,String EmployeeSalary,String EmployeeLocation) {
		this.EmployeeID=EmployeeID;
		this.EmployeeSalary=EmployeeSalary;
		this.EmployeeLocation=EmployeeLocation;
	}
	
	
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	
	public String getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	public String getEmployeeLocation() {
		return EmployeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		EmployeeLocation = employeeLocation;
	}
	
	

}
