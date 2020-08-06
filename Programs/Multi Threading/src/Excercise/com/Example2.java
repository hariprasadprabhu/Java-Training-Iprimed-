package Excercise.com;
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
public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		Thread1 t3 = new Thread1();
		t1.start();
		t2.start();
		t3.start();
		System.out.println(Thread.activeCount());// total number of threads present presently
		t1.join();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		t1.setName("ram");
		System.out.println(Thread.activeCount());
		
	}

}
