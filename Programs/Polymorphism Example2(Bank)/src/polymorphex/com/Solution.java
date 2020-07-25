package polymorphex.com;

class RBI
{
	Integer loan=500000;
	void home()
	{
		System.out.println("Loan amount all banks");
	}
	
	void carLoan()
	{
		System.out.println("Car loan");
	}
}

class SBI extends RBI
{
	int interest=2;
	@Override
	void home()
	{
		System.out.println("home loan interest from SBI "+(loan*interest/100));
	}
}

class HDFC extends RBI
{
	int interest=3;
	@Override
	void home()
	{
		System.out.println("Home loan interest from HDFC "+(loan*interest/100));
	}
	@Override
	void carLoan()
	{
		System.out.println("Car loan available from HDFC");
	}
}

class AXIS extends RBI
{
	int interest=5;
	@Override
	void home()
	{
		System.out.println("Home loan interest from Axis "+(loan*interest/100));
	}
	
}

public class Solution {

	public static void main(String[] args) {
		
		// same methods are doing different tasks its runtime polymorphism
		RBI b=new SBI();
		b.home();  //upcasting
		b =new HDFC();
		b.home();  //upcasting
		b.carLoan();
		b =new AXIS();
		b.home();  //upcasting
		

	}

}
