package multiThreadEx.com;

class MyThreadd extends Thread
{
	public void run()
	{
		System.out.println("Hey all");
	}
}

class Ramesh extends Thread
{
	public void run()
	{
		System.out.println("Entered into Ramesh");
		System.out.println("Ramesh Execution Started");
		for(int i=0;i<10;i++)
			System.out.println("Ramesh");
		System.out.println("Ramesh Ended");
	}
}

class Suresh extends Thread
{
	public void run()
	{
		System.out.println("Entered into Suresh");
		System.out.println("Suresh Execution Started");
		for(int i=0;i<10;i++)
			System.out.println("Suresh");
		System.out.println("Suresh Ended");
	}
}

class Rakesh extends Thread
{
	public void run()
	{
		System.out.println("Entered into Rakesh");
		System.out.println("Rakesh Execution Started");
		for(int i=0;i<10;i++)
			System.out.println("Rakesh");
		System.out.println("Rakesh Ended");
	}
}

public class ThreaStakingEx {

	public static void main(String[] args) 
	{
		Ramesh t1 =new Ramesh();
		Suresh t2 = new Suresh();
		Rakesh t3 = new Rakesh();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Starting Ramesh thread");
		t1.start();
		System.out.println("Starting Suresh thread");
		t2.start();
		System.out.println("Starting Rakesh thread");
		t3.start();
		
	}

}
