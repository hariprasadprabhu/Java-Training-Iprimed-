package foreachex.com;

import java.util.ArrayList;

public class ForEachEx {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("hari");
		a.add("prasad");
		a.add("rakesh");
		a.add("ramya");
		//for each
		for(String aa:a)
		{
			System.out.println(aa);
		}
		//for each with lambda
		a.forEach((list)->System.out.println(list));

	}

}
