package Down_casting;

public class Display {
	
	void convert1(Animal a) {
		if (a instanceof Dog){
			Dog g=(Dog)a;
			System.out.println("Animal converted to dog");
		}else if (a instanceof Cat){
			Cat c=(Cat)a;
			System.out.println("Amila Converted Cat");
		}
	}

}
