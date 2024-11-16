package Method_Override;

public class Test {
	
	public static void main(String[] args) {
		Child_Class c=new Child_Class();
		c.Child_Property();
		c.Parent_property();
		c.marriage();  //child overridden parent method
		c.Marriage();// from parent
	}

}
