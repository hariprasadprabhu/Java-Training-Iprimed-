package queuee.com;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DQueueEx {

	public static void main(String[] args) 
	{
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Hari");
		dq.add("Savitha");
		dq.add("Roshan");
		dq.add("Laxmi");
		dq.add("Rajesh");
		dq.add("Ramya");
		Iterator<String> i =dq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("gwt first : "+dq.getFirst());
		System.out.println("get last : "+dq.getLast());
		System.out.println("\nAfter Queue offer ");
		dq.offer("Rambe");
		i =dq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\nAfter Queue push ");
		dq.push("Roja");
		i =dq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\npop element is "+dq.pop());
		System.out.println("After Queue pop ");
		i =dq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
