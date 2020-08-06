package desmoanEx.com;

public class DeamonEx extends Thread {

	String d;
	public DeamonEx(String d) {
		this.d=d;
	}
	public void run() {
		if(Thread.currentThread().isDaemon())
			System.out.println("Yes it is Demon Threqd "+d);
		else
			System.out.println("not a Deamon Thread "+d);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DeamonEx d = new DeamonEx("d");
		DeamonEx d1 = new DeamonEx("d1");
		DeamonEx d2 = new DeamonEx("d2");
		d.setDaemon(true);// set thread d as Deamon thread 
		
		d.start();
		d1.start();
		d2.start();
	}

}
