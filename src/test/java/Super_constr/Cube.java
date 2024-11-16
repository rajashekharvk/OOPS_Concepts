package Super_constr;

public class Cube {
	
	double height;
	double width;
	double length;
	
	
	Cube(double i){
		this(i,3.0);
	}
	Cube(double i,double w){
		this(i,w,4.0);
	}
	
	Cube(double i,double w, double h){
		height=h;
		width=w;
		length=i;
	}

	void display() {
		double volume=height*length*width;
		System.out.println("Volume of the cude is "+ volume);
	}
}
