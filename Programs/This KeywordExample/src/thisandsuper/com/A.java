package thisandsuper.com;

public class A {
	void sleep()
	{
		System.out.println("Class A sleep");
	}
	void eat()
	{
		System.out.println("Class A Eat");
	}
	void walk()
	{
		System.out.println("Class A Walk");
	}

}

class B extends A{
	B()
	{
		super();
		super.sleep();
		super.eat();
		super.walk();
	}
	void sleep()
	{
		System.out.println("Class B sleep");
	}
	void eat()
	{
		System.out.println("Class B Eat");
	}
	void walk()
	{
		System.out.println("Class B Walk");
	}
}

class C extends B{
	C()
	{
		super();
		super.sleep();
		super.eat();
		super.walk();
		this.sleep();
		this.eat();
		this.walk();
		
	}
	void sleep()
	{
		System.out.println("Class C sleep");
	}
	void eat()
	{
		System.out.println("Class C Eat");
	}
	void walk()
	{
		System.out.println("Class C Walk");
	}
}


