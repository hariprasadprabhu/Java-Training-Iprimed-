package lambda.com;

interface Laptop
{
	public void name();
}
public class LambdaEx {

	static int a=10;
	public static void main(String[] args) {
		int b=20;
		Laptop l =()->{
			a=a+10;
			// b=b+10; not possible to alter this
			System.out.println("Haii");
		};
		l.name();

	}

}
