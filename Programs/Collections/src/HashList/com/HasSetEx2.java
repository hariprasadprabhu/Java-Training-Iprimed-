package HashList.com;
import java.util.HashSet;
import java.util.Iterator;


class Emp1
{
	int id;
	String name;
	int age;
	public Emp1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}


public class HasSetEx2 {

	public static void main(String[] args) 
	{
		Emp1 e1 = new Emp1(1,"Hari",26);
		Emp1 e2 = new Emp1(2,"Rajesh",23);
		Emp1 e3 = new Emp1(3,"Akash",24);
		
		HashSet<Emp1> list = new HashSet<Emp1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Iterator<Emp1> i =list.iterator();
		while(i.hasNext())
		{
			Emp1 ee = i.next();
			System.out.println(ee.id+" "+ee.name+" "+ee.age);
		}
	}

}
