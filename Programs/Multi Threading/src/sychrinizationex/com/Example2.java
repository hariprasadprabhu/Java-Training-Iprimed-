package sychrinizationex.com;


class  Number
{
	/* synchronized method
	synchronized void printNumber(int num) throws InterruptedException //it will lock for a thread then moves to another
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(num+i);
			Thread.sleep(1000);
			
		}
	}*/
	
	//Bock syncronization
	void printNumber(int num) throws InterruptedException {
		System.out.println("run out side");// it will not run sychronized way because out side
		synchronized(this)// can be specified only part to be synchronized
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(num+i);
				Thread.sleep(1000);
			}
		}
	}
	
	
	
}

class MyThread1 extends Thread
{
	Number n;
	MyThread1(Number n)
	{
		this.n=n;
	}
	public void run()
	{
		try {
			n.printNumber(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyThread2 extends Thread
{
	Number n;
	MyThread2(Number n)
	{
		this.n=n;
	}
	public void run()
	{
		try {
			n.printNumber(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		Number n =new Number();
		MyThread1 t1 = new MyThread1(n);
		MyThread2 t2 = new MyThread2(n);
		t1.start();
		t2.start();

	}

}
