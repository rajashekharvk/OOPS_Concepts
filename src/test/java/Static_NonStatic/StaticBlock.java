package Static_NonStatic;

public class StaticBlock {
	static int i=10;
	int j=20;
	
	{
		System.out.println(i+j);
	}
	
static{
		
		StaticBlock a=new StaticBlock();
		System.out.println(i+a.j);
	}
	
	public static void main(String[] args) {
		StaticBlock a=new StaticBlock();
	}

}
