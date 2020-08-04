package multiThreadEx.com;
/*
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Hey all");
		System.out.println("Hello This is body");
	}
}

public class Thread1 {

	public static void main(String[] args) {
		MyThread mt =new MyThread();//New State
		mt.start();

	}

}
*/


class Myclass implements Runnable
{
	public void run() {
		System.out.println("hey i am runnable");
		int name =Thread.currentThread().getPriority();
		System.out.println(name);
	}
}

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Hey all");
		System.out.println("Hello This is body");
	}
}

public class Thread1 {

	public static void main(String[] args) {
		Myclass mcf = new Myclass();
		Thread t = new Thread(mcf);
		t.start();

		System.out.println("Hello");
	}

}
