package threadsleep.com;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.currentThread();
			System.out.println("Rama");
			
		}
	}
	
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.currentThread();
			System.out.println("Bharath");
		}
	}
	
}
public class ThreadSleepEx {
	public static void main(String[] args) throws InterruptedException 
	{
		/* Sleep method in Thread- spleeps current thread for a given miliseconds
		 for(int i=0;i<10;i++)
		{
		System.out.println("Rohith");
		Thread.sleep(5000);
		}*/
		//Join method
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		System.out.println(t1.isAlive());// check thread is still alive == true
		t1.join();// wait untill t1 completes execution
		t2.start();
		t2.join();// wait untill t2 completes execution
		System.out.println(t1.isAlive());// check thread is still alive == False
		for(int i=0;i<10;i++)
		{
			System.out.println("Laxman");
			
		}
		
	}

}
