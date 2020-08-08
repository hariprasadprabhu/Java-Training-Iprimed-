package supex.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SupplerEx {

	public static void main(String[] args) {
		/*//Example1
		 * Supplier s =()->{//only to return any value
		 * System.out.println("I can return anything"); return 0; };
		 * 
		 * System.out.println(s.get());
		 */
		
		/*//Example2
		 * Supplier s =()-> { String[] st = {"apple","mango","banana","chikku"}; int i =
		 * (int) (Math.random()*3+1); return st[i]; };
		 * 
		 * System.out.println(s.get()); System.out.println(s.get());
		 * System.out.println(s.get()); System.out.println(s.get());
		 * System.out.println(s.get());
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(23);
		al.add(22);
		al.add(45);
		al.add(23);
		al.add(28);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		List<Integer> even = new ArrayList<Integer>();
		
		//Without stream for sorting
		/*
		 * for(int i:al) { if(i%2==0) even.add(i); } System.out.println(even);
		 */
		
		// using Stream
		System.out.println(al.stream().filter(i->i%2==0).collect(Collectors.toList()));
	}

}
