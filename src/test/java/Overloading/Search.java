package Overloading;

public class Search {
	
	int Search(int i) {
		return i; 
	}
	
	/*double Search(double i) {
		return i;
	}
	
	int Search(int i, int j) {
		
		return i;
	}
	*/
	
	public static void main(String[] args) {
		Search S1=new Search();
		
		System.out.println("Pass value and retunr for Search int i constructor"+S1.Search(5));
		
		
	}

}
