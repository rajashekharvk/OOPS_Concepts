package withut_Inheritance;

public class Mobile {
	
	Setting s = new Setting();
	String name="Samsung";
	double cost=20000.0;
	
	void checkingsetting() {
		System.out.println("Checking Wifi connection in Mobile");
		s.connectedwifi();
	}

}
