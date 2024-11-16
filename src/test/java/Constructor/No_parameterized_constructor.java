package Constructor;

public class No_parameterized_constructor {
	
	No_parameterized_constructor(){
		System.out.println("I am inside Constructor");
	}
	
	void display() {
		System.out.println("I am inside the display method");
	}

	
	public static void main(String[] args) {
		No_parameterized_constructor d= new No_parameterized_constructor();
		d.display();
	}
}
