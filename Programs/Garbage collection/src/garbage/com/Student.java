package garbage.com;

public class Student {
	Integer roll;
	String name;
	public Student(Integer roll,String name) {
		this.name=name;
		this.roll=roll;
		System.out.println("Exicuted");//this line wrten for last example
	}
	//below function is for System.gc()
	public void finalize()
	{
		System.out.println(roll+" garbage collected");
		
	}

}
