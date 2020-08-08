package mapEx.com;

import java.util.Map;
import java.util.TreeMap;

class Student2
{
	int roolno,age;
	String name;
	public Student2(int roolno, int age, String name) {
		super();
		this.roolno = roolno;
		this.age = age;
		this.name = name;
	}
	
}
public class TreeMapEx {

	public static void main(String[] args) 
	{
		TreeMap<Integer, Student2> tm = new TreeMap<Integer, Student2>();
		Student2 s1 = new Student2(1, 25, "Hari");
		tm.put(5,s1);
		s1 = new Student2(2, 28, "Rajesh");
		tm.put(5, s1);//this will ove write the Hari because no duplicate keys allowed
		s1 = new Student2(3, 10,"Ramya");
		tm.put(3,s1);
		tm.put(4,s1);//cannot insert same value not accepted by tree
		s1 = new Student2(4, 29, "Menaka");
		tm.put(4,s1);
		//s1 = new Student2(7, 56, "rambe");
		//tm.put(null,s1);   null is not acceptable
		for(Map.Entry<Integer,Student2> l: tm.entrySet() )
		{
			System.out.println(l.getValue().roolno+" "+l.getValue().age+" "+l.getValue().name);//sorted according to keys
		}
	}

}
