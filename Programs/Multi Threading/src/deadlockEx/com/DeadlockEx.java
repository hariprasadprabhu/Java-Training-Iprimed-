package deadlockEx.com;

public class DeadlockEx {
	static String ram="good night";//declaring any objects
	static String sham ="Good night";

	public static void main(String[] args) 
	{
		Thread t1 = new Thread() {
		public void run()
		{
			synchronized(ram) //this passes the object
			{
				System.out.println("Thread1 :Object ram is LOCKED");
				try
				{
					Thread.sleep(1000);//letting other thread to perform their task
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				
			
			synchronized (sham) {
				System.out.println("Thread 1:Object  sham is LOCKED");
			}
			}
		}
	};
	Thread t2 = new Thread() {
		public void run()
		{
			synchronized(sham) 
			{
				System.out.println("Thread2:Object sham is LOCKED");
				try
				{
					Thread.sleep(1000);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				
			
			synchronized (ram) //calling the object which is already locked by another thread
			{
				System.out.println("Thread2:Object  ram is LOCKED");
			}
			}
		}
	};
	t1.start();
	t2.start();
	

}
}
