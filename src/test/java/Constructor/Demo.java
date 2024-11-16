package Constructor;

public class Demo {
	
	Demo(String s, int i){
		System.out.println("vaue of i is "+i+"\nvalue of S is "+s);
	}
	
	void display() {
		System.out.println("i am inside the Display method");
	}

	public static void main(String[] args) {
		Demo d=new Demo("Rashda",10);
		d.display();
			
	}
}
