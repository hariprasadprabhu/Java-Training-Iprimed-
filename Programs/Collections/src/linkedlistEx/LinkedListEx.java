package linkedlistEx;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Hari");
		l.add("Prasad");
		l.add("sandesh");
		l.add("kaushal");
		l.pop();//pops first element
		System.out.println(l.get(0));
		System.out.println(l.peekLast());//last element
		System.out.println(l.peekFirst());//first element
		Iterator<String> i = l.descendingIterator();//displays from back
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
