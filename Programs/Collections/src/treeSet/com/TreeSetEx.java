package treeSet.com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Hari");
		t.add("Akhil");
		t.add("Sachin");
		t.add("Sujith");
		System.out.println(t.headSet("Hari",true));//display untill Hari
		System.out.println(t.headSet("Hari",false));//display untill Hari exclude Hari
		for(String st:t)
		{
			System.out.println(st);//show in assending order
		}
		System.out.println();
		Iterator<String> i =t.descendingIterator();// to make it desending order
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		/*System.out.println("poll results");
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println("after pollfirst and polllast");
		for(String st:t)
		{
			System.out.println(st);//show in assending order
		}
		
		System.out.println();
		for(String st:t)
		{
			System.out.println(st);//show in assending order
		}*/
		System.out.println(t.subSet("Akhil",true, "Sachin",true));//from akhi to sachin including both
		System.out.println(t.tailSet("Hari",true));//from hari to the end including hari
		System.out.println(t.headSet("Sachin",true));//from first to sachin including sachin
	}

}
