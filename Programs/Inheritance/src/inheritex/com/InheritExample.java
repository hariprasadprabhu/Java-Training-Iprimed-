package inheritex.com;

import java.io.IOError;
import java.io.IOException;

/*
 * // single inheritence 
 * class Dog
 * { 
 * String name="Tomy"; 
 * String color="broen";
 * String bread="lab";
 * 
 * @Override public String toString() { return
 * "Dog [name="+name+" color="+color+" bread="+bread+"]"; }
 * 
 * } class Tommy extends Dog {
 * 
 * }
 * 
 * public class InheritExample {
 * 
 * public static void main(String[] args) { Tommy t=new Tommy();
 * System.out.println(t.toString()); } }
 */

/*//Multi level inheritence
 * class Adog {
 * 
 * String name="Tomy"; String color="broen"; String bread="lab";
 * 
 * @Override public String toString() { return
 * "Dog [name="+name+" color="+color+" bread="+bread+"]"; } void get1() {
 * System.out.println("name:"+name); }
 * 
 * }
 * 
 * class B extends Adog { void get2() { System.out.println("color:"+color); } }
 * 
 * class D extends B {
 * 
 * }
 * 
 * 
 * public class InheritExample {
 * 
 * public static void main(String[] args) { D d =new D(); d.get1(); d.get2(); }
 * }
 */


/*
// heirarchial inheritence
class Parent {

	String name = "Tomy";
	String color = "broen";
	String bread = "lab";

	@Override
	public String toString() {
		return "Dog [name=" + name + " color=" + color + " bread=" + bread + "]";
	}

	void get1() {
		System.out.println("name:" + name);
	}

}

class Child1 extends Parent {
	int legs = 4;

	void get2() {
		System.out.println("legs are: " + legs);
	}
}

class Child2 extends Parent {
	int sleep = 10;

	void get3() {
		System.out.println("sleep is :" + sleep + " hours");
	}
}

public class InheritExample {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		c1.get1();
		c1.get2();
		System.out.println(c1.toString());

		c2.get1();
		c2.get3();
		System.out.println(c2.toString());
	}
}
*/



class Parent {

	String name ="honda";
	String color ="black";
	
	
	void Bike()//if we have some compile time exception here then only overidden method can have that same exception
	{
		
		System.out.println("Boke name :"+name+" color: "+color);
	}
	
	void Book() throws IOException // no need to add this compile time exception in overriden method
	{
		System.out.println("Book name"+"java");
		throw new IOException();
	}

}

class Child extends Parent {

	String color = "red";
	
	@Override
	void Bike()
	{
		System.out.println("Boke name :"+name+" color: "+color);
		throw new ArithmeticException(); // we can have any type of run time exception even if parent doesnt have it
	}
	
	@Override
	void Book()
	{
		System.out.println("Book name"+"Wings of fire");
	}
	void dress()
	{
		System.out.println("dress");
	}
}


public class InheritExample {

	public static void main(String[] args) {
		Child c = new Child();
		c.Bike();
		c.Book();
		
		Parent p =new Child();//Upcasting comes under polymorphism
		p.Bike();
		// this can access everything from parent and only overriden method from child
		
		Parent p1 =new Child();
		((Child) p1).dress();//down casting comes under polymorphism
		
	}
}
