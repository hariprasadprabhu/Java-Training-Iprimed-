package demo.com;

public class Dog {
	String name;
	int legs;
	String color;
	String breed;
	int tail;
	//if its not initialized JVM will give the default values.

	public void sleep()
	{
		int hours = 10;
		System.out.println("The Sleep time is:"+hours);
	}
	public void sleep1(int a)
	{
		int hours = a;
		System.out.println("The Sleep time is:"+hours);
	}public String sleep(int a)
	{
		int hours = a;
		System.out.println("The Sleep time is:"+hours);
		return "Alaram set at"+hours;
	}
}
