package assignment.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


class Player
{
	String name;
	int score;
	Player(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
}
class Checker implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Player p1 =(Player) o1;
		Player p2 =(Player) o2;
		if(p1.score>p2.score)
			return -1;
		else if(p1.score<p2.score)
			return 1;
		else
		{
			return p1.name.compareTo(p2.name);
		}
	}
	
}

public class Assignment2 {

	public static void main(String[] args) 
	{
		int score,pi=0;
		String name;
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Player> list = new ArrayList<Player>();
		for(int i=0;i<n;i++)
		{
			name=scan.next();
			score =scan.nextInt();
			list.add(new Player(name, score));
		}
		Collections.sort(list, new Checker());
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			Player p1= (Player) itr.next();
			System.out.println(p1.name+" "+p1.score);
		}
	}

}
