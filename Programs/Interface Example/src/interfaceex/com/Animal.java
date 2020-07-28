package interfaceex.com;

public interface Animal 
{
	int a=10;// it changes to public static final int a=10;
	
	public abstract void eat();
	
	void sleep();  // aboove and this both are same way
	
	static void hunt()
	{
		System.out.println("Yes this will hunt");
	}
	
	default void soud()
	{
		System.out.println("Yes this can make sound");
	}
	
}

class Lion implements Animal
{
	@Override
	public void eat() {
		System.out.println("Lion eats deers");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Lion will sleep for 13 hours");
	}
}

class Cat implements Animal
{
	@Override
	public void eat() {
		System.out.println("Cats eats rats");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Cats will sleep for 15 hours");
	}
}

interface Dinosaur extends Animal 
{
	void lastSeen();
}

class VegDino implements Dinosaur
{
	@Override
	public void lastSeen()
	{
		System.out.println("Its so many years agooo");
	}
	@Override
	public void eat() {
		System.out.println("Cats eats rats");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Cats will sleep for 15 hours");
	}
}

//---------------------------------------------------------------------------------------------------------------------------

// example below 1)interface can extend any number of interfaces and 2)class can implement any number of interfaces
interface Tiger
{
	void sleep();
}

interface Dog
{
	void eat();
}

interface wildAnimal extends Tiger,Dog // interface can extend any number of interfaces
{
	@Override
	default void sleep()
	{
		System.out.println("wildanimal sleeping");
	}
	@Override
	default void eat()
	{
		System.out.println("wild animal is eatinmg");
	}
}
class example implements wildAnimal
{
	
}

class AnimalWild implements Tiger,Dog // class can implement any number of interfaces
{
	@Override
	public void sleep()
	{
		System.out.println("wildanimal sleeping");
	}
	@Override
	public void eat()
	{
		System.out.println("wild animal is eatinmg");
	}
}


//---------------------------------------------------------------------------------------------------------------------------


// class can extend 1 class and implements any number of interfaces
class ani
{
	
}

class NewAnimal extends ani implements Dog // should be in the same format first extend then implement
{

	@Override
	public void eat() 
	{
		
	}
	
}

//---------------------------------------------------------------------------------------------------------------------------

