package InterviewAssignments;


public class Abstract_Implementation {
	
	public static void main(String[] args) {
		ImplementsAbstractmethods obj=new ImplementsAbstractmethods();
		obj.Method1();
		obj.Method2();
	}
}

abstract class AbsClass {
	
	public abstract void Method1();
	
	public void Method2() {
		System.out.println("Method2 concreate method ");
	}
}

class ImplementsAbstractmethods extends AbsClass{

	@Override
	public void Method1() {
		System.out.println("Implemented Abstract method");
		
	}
	
	public  void method1() {
		// TODO Auto-generated method stub

	}
	
}




