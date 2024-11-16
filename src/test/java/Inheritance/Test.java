package Inheritance;

public class Test {
	public static void main(String[] args) {
		System.out.println("Accessing parents Members");
		Employee1 e=new Employee1();
		System.out.println(e.bonus);
		e.working();
		System.out.println("Accessing both parent and child");
		Developer d=new Developer();
		System.out.println(d.bonus );
		System.out.println(d.sal );
		d.working();
		d.development();
	}

}
