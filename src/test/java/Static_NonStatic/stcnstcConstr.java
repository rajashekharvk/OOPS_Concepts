package Static_NonStatic;

public class stcnstcConstr {
	
	{
		System.out.println("i am in nonstatic block");
	}
	
	stcnstcConstr(){
		System.out.println("I am in Constructor");
	}
	
	static {
		System.out.println("i am in static block");
	}
	
	public static void main(String[] args) {
		stcnstcConstr n =new stcnstcConstr();
	}
}
