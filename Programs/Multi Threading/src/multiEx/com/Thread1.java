package multiEx.com;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Hey all");
		System.out.println("Hello This is body");
		System.out.println(Thread.currentThread().getName());
	}
}

public class Thread1 {

	public static void main(String[] args) {
		MyThread mt =new MyThread();//New State
		mt.setName("hari");//setting thread name
		mt.start();
		

	}

}