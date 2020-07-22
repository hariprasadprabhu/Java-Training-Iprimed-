package overloading.com;

public class Addition {
	int a,b,c,d;
	public void add(int a,int b,int c) {
		System.out.println("Result of int number is :"+(a+b+c));
	}
	public void add(float e, float f, float g) {
		System.out.println("Result of float  number is :"+(e+f+g));	
	}
	public void add(double h, double i, double j) {
		System.out.println("Result of double  number is :"+(h+i+j));	
		
	}
}
