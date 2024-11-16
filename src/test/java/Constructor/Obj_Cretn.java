package Constructor;

public class Obj_Cretn {
	
	String name;
	int id;
	String collegename;
	
	Obj_Cretn(String name,int id, String collegename){
		this.name=name;
		this.id=id;
		this.collegename=collegename;
	}
	
	void display() {
		System.out.println("Name is "+name+"\nId is "+id+"\nCollege name is"+collegename);
	}

}
