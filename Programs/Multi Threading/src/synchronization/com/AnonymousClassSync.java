package synchronization.com;
class  Number
{
	synchronized void printNumber(int num) throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(num+i);
			Thread.sleep(1000);			
		}
	}
}
public class AnonymousClassSync {

	public static void main(String[] args) 
	{
		Number n =new Number();
		Thread t1 = new Thread()
		{
			public void run()
			{
				try {
					n.printNumber(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				try {
					n.printNumber(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		t1.start();
		t2.start();


	}

}
