package encapsu.com;

public class ATM 
{
	private String name="SBI";
	private Integer password = 1234;
	private Integer CVV = 345;
	
	private ATM(String name, Integer password, Integer cvv) {
		super();
		this.name = name;
		this.password = password;
		this.CVV = cvv;
	}
	
	void take(Integer password, Integer cvv)
	{
		this.password=password;
		this.CVV=cvv;
	}
	ATM()
	{
		
	}
}


// every thing is private in parent class so connot write super() 
class YourFriend extends ATM
{

	String Name;
	Integer passw;
	Integer cvv;
	
	/* cannot use this because of encapsulation we need to remove all private key word in parent class
	public YourFriend(String name, Integer password, Integer cvv) {
		super(name,password,cvv);
		System.out.println(super.name+" "+super.password+" "+super.CVV);
		this.Name = name;
		this.passw =password;
		this.cvv = cvv;
	}
	*/
	
	void change(Integer passwordd,Integer cvvv)
	{
		this.passw=passwordd;
		this.cvv=cvvv;
	}
	void disp()
	{
		System.out.println(this.passw);
		System.out.println(this.Name);
		System.out.println(this.cvv);
	}
	
	
}