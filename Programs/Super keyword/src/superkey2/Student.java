package superkey2;


class Teacher
{
		String name="Santhosh";
		String sub="java";
		Teacher() {		
			System.out.println(this.name+" "+this.sub);
		}
		void subject()
		{
			System.out.println(this.sub);
		}
}

public class Student extends Teacher{
	Integer roll;
	String name;
	Student(Integer roll,String name) {
		super();
		this.roll=roll;
		this.name=name;
	}
	void disp()
	{
		System.out.println(super.name+" "+super.sub);
		System.out.println(this.name+" "+this.roll);
	}

}
