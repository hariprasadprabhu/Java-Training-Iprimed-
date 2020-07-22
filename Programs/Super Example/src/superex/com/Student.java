package superex.com;

class Teacher{
	
	Teacher(int a)
	{
		System.out.println("This is teacher"+ a);
	}
	
}

public class Student extends Teacher {
	protected int a=10;
	public Student()
	{
		super(10);
		
		System.out.println("This is Student");
	}

}

