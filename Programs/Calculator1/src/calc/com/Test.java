package calc.com;

public class Test {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int a=20;
		int b=10;
		c.add();
		int res1=c.sub();
		System.out.println("Difference is :"+res1);
		c.mul(a, b);
		int res2=c.div(a, b);
		System.out.println("Division result is :"+res2);
	} 
}
