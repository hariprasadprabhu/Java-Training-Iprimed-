package threadCommunication;


class  Number 
{
	int amount =20000;
	synchronized void increment(int amount)
	{
		System.out.println("Increment salary");
		if(this.amount<amount)
		{
			System.out.println("please give 30% hike");
		}
		else {
			try {
				wait();//waits untill another thread encounters notify()
				System.out.println("Done");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	synchronized void deposited(int amount)
	{
		System.out.println("Amountc to be deposited");
		this.amount+=amount;
		System.out.println("deposition complete");
		notify();//give back execution to waiting thread();
}
}
public class ExampleCommunicatio {

	public static void main(String[] args) {
		Number n =new Number();
		Thread t1 = new Thread()
		{
			public void run()
			{
				try {
					n.increment(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				try {
					n.deposited(30000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		t1.start();
		t2.start();
	}

}
