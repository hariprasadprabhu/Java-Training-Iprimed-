package abstractex.com;

public abstract class Car {
	int model;
	
	public Car(int model)
	{
		this.model=model;
		System.out.println("Parentt contsructor");
	}

	void speed()
	{
		System.out.println("Speed is "+" "+"300km/h");
	}
	
	//If i dont want to give a body for a method i can give it as 
	//class also should be abstract if you want to write a abstract method
	abstract void millage();
	
	void model()
	{
		System.out.println("model is "+" "+model);
	}
	final void Fourwheels()
	{
		System.out.println("4 wheel ");
	}
}

class Hundai extends Car
{
	public Hundai(int model) {
		super(model);
	}

	@Override
	void millage()
	{
		System.out.println("millage is"+" "+"14km");
	}
	
	@Override
	void speed()
	{
		System.out.println("Speed is "+" "+"150km/h");
	}
}

class BMW extends Car
{
	public BMW(int model) {
		super(model);
	}

	@Override
	void millage()
	{
		System.out.println("millage is"+" "+"12km");
	}
	
	@Override
	void speed()
	{
		System.out.println("Speed is "+" "+"150km/h");
	}
}