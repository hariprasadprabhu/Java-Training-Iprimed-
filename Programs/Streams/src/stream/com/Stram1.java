package stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Laptop
{
	int id;
	String name;
	float price;
	
	public Laptop(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class Stram1 {

	public static void main(String[] args) 
	{
		List<Laptop> l = new ArrayList<Laptop>();
		l.add(new Laptop(1, "Lenovo", 20000));
		l.add(new Laptop(2, "HP", 25000));
		l.add(new Laptop(3, "Mac", 30000));
		l.add(new Laptop(4, "Dell", 35000));
		
		/*
		List<Float> l1 = new ArrayList<Float>();
		
		for(Laptop lap:l)
		{
			if(lap.price<30000)//laptop price less that 300000
			{
				l1.add(lap.price);
			}
		}
		System.out.println(l1);
		*/
		
		List<Float> patternwated= (List<Float>) l.stream().filter(pri->pri.price>20000).map(pri->pri.price).collect(Collectors.toList());
		System.out.println(patternwated);
		
	}

}
