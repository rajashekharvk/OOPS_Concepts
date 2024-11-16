package Static_NonStatic;

public class mysql {
	
	static {
		checklicence();
		checkservice();
		checkport();
	}
	
	mysql(){
		System.out.println("My SQL application is launched");
	}
	
	public static void main(String[] args) {
		mysql m=new mysql();
	}
	
	static void checklicence()
	{
		System.out.println("licensed issued");
	}
	static void checkservice() {
		System.out.println("Service is on");
	}
	
	static void checkport() {
		System.out.println("port number is present");
	}
	
	
}
