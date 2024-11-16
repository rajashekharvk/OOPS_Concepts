package withut_Inheritance;

public class Person {
	String name="Angel";
	Mobile m=new Mobile();
	
	void Talkingonmobile() {
		System.out.println(name+"talking on"+m.name+"Mobile");
		m.checkingsetting();
	}

}
