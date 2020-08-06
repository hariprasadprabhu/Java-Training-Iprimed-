package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Emp implements Comparable<Emp>
{
	int id;
	String name;
	int age;
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	/*@Override
	public int compareTo(Emp o) {
		if(age==o.age)
			return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}*/
	@Override
	public int compareTo(Emp e)
	{
		int num = name.compareTo(e.name);//compareTo from String class
		System.out.println(num);
		return num==0?name.compareTo(e.name):num;
	}
}

public class ComparableEx {

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1,"Hari",26);
		Emp e2 = new Emp(2,"Rajesh",23);
		Emp e3 = new Emp(3,"Akash",24);
		
		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Iterator<Emp> i =list.iterator();
		while(i.hasNext())
		{
			Emp d= i.next();
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
		Collections.sort(list);//  this will compare the compareTo Method as we discussed above which compares age
		i =list.iterator();
		while(i.hasNext())
		{
			Emp d= i.next();
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
		Collections.sort(list);//this will compare the compareTo Method as we discussed above which compares name
		i =list.iterator();
		while(i.hasNext())
		{
			Emp d= i.next();
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
	}

}
