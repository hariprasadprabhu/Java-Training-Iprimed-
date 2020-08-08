package assignment.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Integer>[] al = new ArrayList[n];
		int ai=0;
		for(int i=0;i<n;i++)
		{
			al[ai]=new ArrayList<Integer>();
			int a= scan.nextInt();
			for(int j=0;j<a;j++)
			{
				int b = scan.nextInt();
				al[ai].add(b);
			}
			ai++;
		}
		ArrayList ar = new ArrayList();
		int q = scan.nextInt();
		for(int i=0;i<q;i++)
		{
			int a = scan.nextInt();
			int b =scan.nextInt();
			try
			{
				ar.add(al[a-1].get(b-1));
			}
			catch(Exception e)
			{
				ar.add("ERROR!");
			}
		}
		Iterator itr = ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
