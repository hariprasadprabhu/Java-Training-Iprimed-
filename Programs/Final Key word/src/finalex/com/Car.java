package finalex.com;

public class Car {
	
	/*// normal initialization of final 
		final int speed=60;
		final int speed1; // if not initialized then only constructor has to initialize it
		
		Car(int speed1)
		{
			this.speed1=speed1;
		}
		
		void go()
		{
			// speed=speed+10; cannot assign or alter the final value anywhere once after initialization inside any methods
			int accelrate = 20+speed;
		}
		
		*/

	
	/*
	// final with static key word
	final int speed=60;
	static final int speed1; // if not initialized then only constructor has to initialize it
	
	static    
	{
		speed1=40;// only static block can initialize static final variable
	}
	
	public Car() {
		//spedd1=30;// not possible anywhere out side static block for static final variable
	}


	void go()
	{
		
	}
	*/
	
	
	
	
	// final methods
	int speed1; 
	public Car(int speed) {
		speed1=speed;
	}
	final void go()
	{
		System.out.println("car speed is "+speed1);
	}
}
class Maruthi extends Car
{
	Maruthi(int speed)
	{
		super(speed);
	}
	
	// @Override                   we cannot override the final method
	// void go()
	// {
	//  	System.out.println("car speed in child class "+speed1);
	// }
	
	
}

/*// cannot extend the final class
class final A
{
	
}

class b extends A
{
	
}
*/