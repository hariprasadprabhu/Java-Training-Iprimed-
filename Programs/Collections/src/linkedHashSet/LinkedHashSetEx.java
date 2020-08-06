package linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;
class Student
{
	int rollno;
	String name;
	String sub;
	public Student(int rollno, String name, String sub) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.sub = sub;
	}
	
}

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<Student> s = new LinkedHashSet<Student>();
		s.add(new Student(11, "ram", "java"));
		s.add(new Student(12, "Prasad", "python"));
		s.add(new Student(13, "rakesh", "maths"));
		s.add(new Student(14, "ramya", "hindi"));
		for(Student st:s)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.sub);
		}
		System.out.println(s.size());
		

	}

}
