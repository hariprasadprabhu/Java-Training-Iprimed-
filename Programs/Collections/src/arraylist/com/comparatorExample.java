package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	public Emp1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
class Age implements Comparator //we can compare multiple values
{

	/*@Override//for age sorting
	public int compare(Object o11, Object o12) {
		Emp1 o1=(Emp1)o11;
		Emp1 o2 = (Emp1)o12;
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}*/
	
	@Override
	public int compare(Object o11, Object o12) {
		Emp1 o1=(Emp1)o11;
		Emp1 o2 = (Emp1)o12;
		return o1.name.compareTo(o2.name);
	}
	
}
public class comparatorExample {

	public static void main(String[] args) 
	{
		Emp1 e1 = new Emp1(1,"Hari",26);
		Emp1 e2 = new Emp1(2,"Rajesh",23);
		Emp1 e3 = new Emp1(3,"Akash",24);
		
		ArrayList<Emp1> list = new ArrayList<Emp1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Iterator<Emp1> i =list.iterator();
		while(i.hasNext())
		{
			Emp1 d= i.next();
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
		System.out.println();
		/*Collections.sort(list,new Age());//  this will compare the compare Method as we discussed above which compares age
		 i =list.iterator();
		while(i.hasNext())
		{
			Emp1 d= i.next();
			System.out.println(d.id+" "+d.name+" "+d.age);
		}*/
		System.out.println();
		Collections.sort(list,new Age());//  this will compare the compare Method as we discussed above which compares name
		 i =list.iterator();
		while(i.hasNext())
		{
			Emp1 d= i.next();
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
	}

}
