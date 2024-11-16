package withut_Inheritance;

public class Wifi {
	
	void statuswifi() {
		System.out.println("connecting...");
	}
	
	void connectingwifi(String ssid,String Password) {
		if(ssid.equals("Rashda")&& Password.equals("123@#")) {
			System.out.println("connected to wifi");
		}
	}
		
}


