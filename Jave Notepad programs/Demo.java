//There should not be 2 classes with same name
// Only one class can have access modifier that should be same as your file name 

public class Demo{
	int a = 10;
	int b = 20;
	public void goodMorning()
	{
		System.out.println("Good Morning Guys");
	}

}
class Demo1{
	int a = 30;
	int b = 40;
	public void goodAfternoon()
	{
		System.out.println("Good Afternoon Guys");
	}

}
class Test{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.goodMorning();
	}


}