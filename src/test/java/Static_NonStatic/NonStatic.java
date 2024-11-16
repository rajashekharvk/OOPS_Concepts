package Static_NonStatic;

public class NonStatic {
	
	{
		System.out.println("i am in  Nonstatic block");
	}
	
	{
		System.out.println("i am in  Nonstatic1 block");
	}
	
	{
		System.out.println("i am in  Nonstatic2 block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("i am in main method");
		NonStatic n=new NonStatic();// non static blocks are executed at the time of object creation
		
	}

}
