package calc.com;

public class Calculator {
	
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("The sum is :"+(a+b));
	}
	public int sub()
	{
		int a=10;
		int b=20;
		return (b-a);
	}
	public void mul(int a, int b)
	{
		System.out.println("Product is :"+a*b);
	}
	public int div(int a,int b)
	{
		return a/b;
	}

}


