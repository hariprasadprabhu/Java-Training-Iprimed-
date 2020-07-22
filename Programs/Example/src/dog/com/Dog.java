package dog.com;

public class Dog {
	String name;
	int legs;
	String breed;
	Dog(String name,int legs,String breed)
	{
		//name = name; 
		this.name = name;// this help to overcome shadowing
		this.legs = legs;
		this.breed = breed;
	}
	Dog()
	{
		
	}
	public void dislay()
	{
		System.out.println("Name: "+name+"\nlegs :"+legs+"\nBreed :"+breed);
	}

}
