package student.com;

public class Student {
	public int roll;
	public String name;
	public String gender;
	public String dob;
	public String std;
	public Student(int roll, String name, String gender, String dob, String std) {
		super();
		this.roll = roll;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.std = std;
	}
	public Student(Student s2) {
		this.roll=s2.roll;
	}
	public void disp()
	{
		System.out.println("Roll number: "+roll+"\nname: "+name+"\ngender: "+gender+"\nDate of birt: "+dob+"\nStandard: "+std);;
	}
	

}
