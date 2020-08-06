package queuee.com;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq =new PriorityQueue<String>();
		pq.add("Hari");
		pq.add("Savitha");
		pq.add("Roshan");
		pq.add("Laxmi");
		pq.add("Rajesh");
		pq.add("Ramya");
		Iterator<String> i =pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\nAfter poll");
		System.out.println("Polled element "+pq.poll());//removes last elements and give that value 
		i =pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\nAfter push");
		pq.add("rakshitha");
		i =pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\nAfter queue.remove ");//first element got deleted
		pq.remove();
		i =pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
