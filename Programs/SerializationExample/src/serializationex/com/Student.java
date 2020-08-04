package serializationex.com;

import java.io.Serializable;


public class Student implements Serializable
{
	public int id;
	public String name;
	public int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	

}
