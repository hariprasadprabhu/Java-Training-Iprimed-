package treeSetEx.com;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Solution {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int c=s.nextInt();
		TreeSet<String>[] t = new TreeSet[c];
		int si=0;
		for(int i=0;i<c;i++)
		{
			t[si]=new TreeSet<String>()
			int n =s.nextInt();
			for(int j=0;j<n;j++)
			{
				String name=s.next();
				t[si].add(name);
			}
			si++;
		}
		Iterator<String > itr;
		for(int i=0;i<si;i++)
		{
			itr=t[i].iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
	}

}

