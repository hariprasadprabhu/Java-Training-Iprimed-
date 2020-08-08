package lambdaex.com;
/*
// before lambda
interface Calclate
{
	public void add();
	
}

public class Lambda1 {

	public static void main(String[] args) 
	{
		Calclate c= new Calclate() {
			@Override
			public void add() 
			{
				System.out.println(10+20);
			}
		};
		c.add();
	}

}



//After lambda without parameters
interface Calclate
{
	public void add();
	
}
public class Lambda1 {
	static int a=10,b=20;
	public static void main(String[] args) 
	{
		Calclate c=()->
		{
			System.out.println("Result = "+(a+b));
		};
		c.add();
	}

}


//After lambda without parameters
interface Calclate
{
	public void add(int a,int b);
	
}
public class Lambda1 {
	static int a=10,b=20;
	public static void main(String[] args) 
	{
		Calclate c=(x,y)->
		{
			System.out.println("Result = "+(x+y));
		};
		c.add(a,b);
	}

}
*/

//lambda with return type
interface Calclate
{
	public int add(int a,int b);
	
}
public class Lambda1 {
	static int a=10,b=20;
	public static void main(String[] args) 
	{
		Calclate c=(x,y)->
		{
			return x+y;
		};
		int ab =c.add(a,b);
		System.out.println("result is "+ab);
	}

}