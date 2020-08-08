package mapEx.com;

import java.util.LinkedHashMap;
import java.util.Map;

class Student1
{
	int roolno,age;
	String name;
	public Student1(int roolno, int age, String name) {
		super();
		this.roolno = roolno;
		this.age = age;
		this.name = name;
	}
	
}
public class linkedHashMap {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Student1> lm=new LinkedHashMap<Integer, Student1>();
		Student1 s1 = new Student1(1, 25, "Hari");
		lm.put(1,s1);
		s1 = new Student1(2, 28, "Rajesh");
		lm.put(8, s1);
		s1 = new Student1(3, 10,"Ramya");
		lm.put(3,s1);
		s1 = new Student1(5, 18,"Pooja");
		lm.put(4,s1);
		s1 = new Student1(4, 29, "Menaka");
		lm.put(4,s1);
		
		for(Map.Entry<Integer,Student1> l: lm.entrySet() )
		{
			System.out.println(l.getValue().roolno+" "+l.getValue().age+" "+l.getValue().name);
		}
	}

}
