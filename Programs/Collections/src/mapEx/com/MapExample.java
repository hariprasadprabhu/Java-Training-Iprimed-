package mapEx.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args)
	{
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "Rajesh");
		m.put(2,"Hariprasad");
		m.put(2, "Rajesh");
		m.put(3, "Harsh");
		m.put(4, "Ranjan");
		
		Set s= m.entrySet();//used to iterate the Map
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+ "==="+entry.getValue());
		}
		System.out.println();
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(8, "Rajesh");
		m1.put(9,"Hariprasad");
		m1.put(10, "Rajesh");
		m1.put(3, "Harsh");
		m1.put(4, "Ranjan");
		m.putAll(m1);
		m.entrySet().forEach(System.out::println);
		System.out.println("\nAfter removing key 10");
		m.remove(10);
		m.entrySet().forEach(System.out::println);
	}

}
