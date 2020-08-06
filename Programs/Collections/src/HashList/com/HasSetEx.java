package HashList.com;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HasSetEx {

	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<String>();
		h.add("ram");
		h.add("dhuma");
		h.add("thoma");
		h.add("sathya");
		h.add("rama"); // it wont be added because of duplicate value
		Iterator<String > i = h.iterator();
		System.out.println("before sorting");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\n\nAfter joining 2 sets");
		HashSet<String> h1 = new HashSet<String>();
		h1.add("rama");
		h1.add("dhuma");
		h1.add("thomson");
		h1.add("sathyanand");
		h.addAll(h1);
		i= h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
