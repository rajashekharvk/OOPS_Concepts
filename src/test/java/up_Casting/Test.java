package up_Casting;

public class Test {
	public static void main(String[] args) {
	/*	Veg v=new Veg();
		v.cook();
		v.chop();
	*/	
		
		Veg v=new Carrot(); //up Casting
		Carrot c= (Carrot)v; //down casting
		
		c.cook();
		c.chop();
		c.preparehalwa();
		System.out.println(c instanceof Veg);
	}
	

}
