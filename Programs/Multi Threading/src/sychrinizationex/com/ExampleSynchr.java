package sychrinizationex.com;

class Thread1 extends Thread
{
	public void run()
	{
		String name =Thread.currentThread().getName();
		if(name.equals("boy"))
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("boy entered");
			}
		}
		else
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("girl entered");
		}
		}
	}
	
}

public class ExampleSynchr {

	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		Thread1 t2 =new Thread1();
		t1.start();
		t2.start();
		t1.setName("boy");
		t2.setName("girl");

	}

}
