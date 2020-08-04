package multiEx.com;

public class Exampple1
{
	static public void main(String[] args)
	{
		System.out.println("Hello world");
		System.out.println("Info of current thread :"+Thread.currentThread());
		System.out.println("Current thread preority "+Thread.currentThread().getPriority());
		System.out.println("Current thread Name "+Thread.currentThread().getName());
		
	}
}
