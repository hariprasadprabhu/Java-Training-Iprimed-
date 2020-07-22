package staticc.com;

public class College {
	String name;
	static int classrooms=20;
	int num_of_students=500;
	
	College(String name,int num_of_students)//we can pass the value to static also
	{
		this.name=name;
		classrooms++;
		this.num_of_students = num_of_students;
	}
	void disp()
	{
		
		System.out.println("Name of college: "+name+"\nNumber of classes: "+classrooms+"\nnumber of students: "+num_of_students);
	}
	static void noOfClass()
	{
		System.out.println("Hey "+classrooms);
	}
	/*static void noOfClass()
	{
		System.out.println("Hey "+name);// cannot use non-static variable inside static method
	}
	*/
	
	{
		System.out.println("Hello 1");
	}
	{
		System.out.println("Hello 2");
	}
}
