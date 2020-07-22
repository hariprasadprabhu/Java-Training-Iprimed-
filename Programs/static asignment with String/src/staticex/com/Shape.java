package staticex.com;
import java.lang.Math;
public class Shape {
	static double pi = Math.PI;
	int radius;
	int sideA,sideB,sideSquare;
	Shape(int sideA,int sideB, int sideSquare,int radius)
	{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideSquare=sideSquare;
		this.radius= radius;
	}
	void rectangle()
	{
		System.out.println("Area of a rectangle:"+(sideA*sideB));
	}
	void square()
	{
		System.out.println("Area of a Square: "+(sideSquare * sideSquare));
	}
	void circle()
	{
		System.out.println("Area of a circle :"+(pi*radius*radius));
	}

}
