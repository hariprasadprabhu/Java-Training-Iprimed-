package anonymous.com;

interface Laptop
{
	public void name();
	void add();
}

abstract class Laptop1 implements Laptop
{
	public abstract void add();
}
public class Anonymousex {

	static int x=10;
	public static void main(String[] args) {
		int y =10;
		new Laptop1() { //writing inner class of laptop
			int a=10;//instace variable for anonnymous class
			@Override
			public void name() {
				System.out.println(x);
				System.out.println(this.a);
			}
			@Override
			public void add()
			{
				System.out.println(x+y);
			}
			
		}.add();

	}

}
