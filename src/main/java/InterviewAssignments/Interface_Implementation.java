package InterviewAssignments;

public class Interface_Implementation {
	public static void main(String[] args) {
		
		Implements obj=new Implements();
		try {
			obj.method1();
			obj.method2();
			System.out.println(class1.var);
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			e.getStackTrace();
		}finally {
			obj.close();
			
		}
		
	}
}

interface class1{
	public static final int var=200;
	public abstract  void  method1();
	void method2();
}

class Implements implements class1{

	@Override
	public void method1() {
		System.out.println("Implemented Method1");
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		System.out.println("Implemented Method2");
		
	}
	
}