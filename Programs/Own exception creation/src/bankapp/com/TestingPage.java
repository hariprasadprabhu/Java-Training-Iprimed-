package bankapp.com;

public class TestingPage {
	double balance = 0.0;
	void addBalance(double newAmount)
	{
		balance+=newAmount;
		System.out.println("Thank you your amount is credited");
	}
	void checkbalance()
	{
		System.out.println("Your acount balance is :"+balance);
	}
	void withdraw(double amount) throws NotEnoughMoney
	{
		if(balance<amount)
		{
			throw new NotEnoughMoney("Sorry You dont have enough money to withraw");
		}
		else
		{
			balance-=amount;
			System.out.println("please recive the amount your current balance is :"+balance);
		}
	}
	

}
