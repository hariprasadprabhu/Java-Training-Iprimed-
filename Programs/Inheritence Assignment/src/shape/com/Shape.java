package shape.com;
import java.lang.Math;

public class Shape {
	static double pi = Math.PI;	
	
}

class Rectangle extends Shape
{
	
	void area(int a,int b)
	{
		System.out.println("Area of rectangle :"+a*b);
	}
}

class Square extends Shape
{
	void area(int a)
	{
		System.out.println("Area of a Square is :"+a*a);
	}
}
class Circle extends Shape
{
	void area(int a)
	{
		System.out.println("Area of circle :"+(pi*a*a));//pi is used from parent class
	}
}

