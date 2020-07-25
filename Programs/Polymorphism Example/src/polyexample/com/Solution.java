package polyexample.com;

class Parent {

	String name ="honda";
	String color ="black";
	
	
	void Bike()
	{
		
		System.out.println("Boke name :"+name+" color: "+color);
	}
	
	void Book() 
	{
		System.out.println("Book name"+"java");
	
	}
	
	void car()
	{
		System.out.println("Parent class");
	}

}

class Child1 extends Parent {

	String color = "red";
	
	@Override
	void Bike()
	{
		System.out.println("Boke name :"+name+" color: "+color);
	
	}
	
	@Override
	void Book()
	{
		System.out.println("Book name"+"Wings of fire");
	}
	
	void dress()
	{
		System.out.println("child1 dress");
	}
}

class Child2 extends Parent {

	String color = "green";
	
	@Override
	void Bike()
	{
		System.out.println("Boke name :"+name+" color: "+color);
	}
	
	@Override
	void Book()
	{
		System.out.println("Book name"+"python");
	}
	
	void dress()
	{
		System.out.println("child2 dress");
	}
}

class Child3 extends Parent {

	String color = "Blue";
	
	@Override
	void Bike()
	{
		System.out.println("Boke name :"+name+" color: "+color);
	}
	
	@Override
	void Book()
	{
		System.out.println("Book name"+"micro controler");
	}
	void dress()
	{
		System.out.println("child 3 dress");
	}
}

class Family
{
	void access(Parent p)
	{
		p.Bike();
		p.Book();
		p.car();
		
	}
	
	void check(Parent p)
	{
		Child1 c1 = (Child1)p;
		c1.dress();
	}
}

public class Solution {

	public static void main(String[] args) {
		/* innorder to do like this ceate a helper class (ex:family in this) and pass object to that using upcasting
		Child1 c1 = new Child1();
		c1.Bike();
		c1.Book();
		c1.dress();
		Child2 c2 = new Child2();
		c2.Bike();
		c2.Book();
		c2.dress();
		Child3 c3 = new Child3();
		c3.Bike();
		c3.Book();
		c3.dress();
		*/
		
		// we can use below to do the same operations
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		Family f = new Family();
		f.access(c1);
		f.access(c2);
		f.access(c3);
		
		
		//If you want to access dress() in c3 we need to down cast
		//steps to downcast
		Parent p1 = new Child1();
		Child1 c11= (Child1) p1;
		c11.dress();
		
		
	}

}
