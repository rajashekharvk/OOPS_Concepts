package Constructor_Chaining;

public class cube {
	
	double height;
	double width;
	double length;
	
	cube(double h){
		this(h,4.0);
	}
	
	cube(double h, double w){
		this(h,w,5.0);
	}
	
	cube(double height,double width, double length){
		this.height =height;
		this.width =width;
		this.length =length;
	}
	
	void volumeofcube() {
		double volume=height*length*width;
		System.out.println("Volume of the cube is "+ volume);
	}
	
		
}
