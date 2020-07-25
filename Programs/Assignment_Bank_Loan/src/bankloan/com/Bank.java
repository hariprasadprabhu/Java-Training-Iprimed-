package bankloan.com;

import java.util.Scanner;

class RBI
{
	int amount=1000000;
	void homeLoan(int amount)
	{
		amount=this.amount;
		System.out.println("RBI will give "+amount+" for your Bank you can use it for giving Home loans");
	}
	void carLoan(int amount)
	{
		amount=this.amount;
		System.out.println("RBI will give "+amount+" for your Bank you can use it for giving Car loans");
	}
}

class SBI extends RBI
{
	int cinterest=10;
	int hinterest=9;
	static int balance=0;
	@Override
	void homeLoan(int amount1) 
	{
		System.out.println("Total interest for your amount on home loan is "+amount1*hinterest/100);
	}
	@Override
	void carLoan(int amount1) {
		System.out.println("Total interest for your amount on car loan is "+amount1*cinterest/100);
	}
	void addMoney(int newAmount)
	{
		balance+=newAmount;
		System.out.println("Thank you your amount is credited");
	}
	void dispAcc()
	{
		System.out.println("Your acount balance is :"+balance);
	}
	void withdraw(int newAmount) throws NotEnoughMoney
	{
		if(balance<newAmount)
		{
			throw new NotEnoughMoney("Sorry You dont have enough money to withraw");
		}
		else
		{
			balance-=newAmount;
			System.out.println("please recive the amount your current balance is :"+balance);
		}
	}
}

class HDFC extends RBI
{
	static int balance=0;
	int cinterest=7;
	int hinterest=10;
	@Override
	void homeLoan(int amount1) 
	{
		System.out.println("Total interest for your amount on home loan is "+amount1*hinterest/100);
	}
	@Override
	void carLoan(int amount1) {
		System.out.println("Total interest for your amount on car loan is "+amount1*cinterest/100);
	}
	void addMoney(int newAmount)
	{
		balance+=newAmount;
		System.out.println("Thank you your amount is credited");
	}
	void dispAcc()
	{
		System.out.println("Your acount balance is :"+balance);
	}
	void withdraw(int newAmount) throws NotEnoughMoney
	{
		if(balance<newAmount)
		{
			throw new NotEnoughMoney("Sorry You dont have enough money to withraw");
		}
		else
		{
			balance-=newAmount;
			System.out.println("please recive the amount your current balance is :"+balance);
		}
	}
}

class AXIS extends RBI
{
	static int balance=0;
	int cinterest=9;
	int hinterest=8;
	@Override
	void homeLoan(int amount1) 
	{
		System.out.println("Total interest for your amount on home loan is "+amount1*hinterest/100);
	}
	@Override
	void carLoan(int amount1) {
		System.out.println("Total interest for your amount on car loan is "+amount1*cinterest/100);
	}
	void addMoney(int newAmount)
	{
		balance+=newAmount;
		System.out.println("Thank you your amount is credited");
	}
	void dispAcc()
	{
		System.out.println("Your acount balance is :"+balance);
	}
	void withdraw(int newAmount) throws NotEnoughMoney
	{
		if(balance<newAmount)
		{
			throw new NotEnoughMoney("Sorry You dont have enough money to withraw");
		}
		else
		{
			balance-=newAmount;
			System.out.println("please recive the amount your current balance is :"+balance);
		}
	}
}

class Helper
{
	void hloan(RBI rb,int amt)
	{
		rb.homeLoan(amt);
	}
	void cloan(RBI rb,int amt)
	{
		rb.carLoan(amt);
	}
	
}

public class Bank {

	public static void main(String[] args) {
		
		SBI sb = new SBI();
		HDFC hd = new HDFC();
		AXIS ax = new AXIS();
		
		Helper hp = new Helper(); // helper class to use upcasting
		
		Scanner sc=new Scanner(System.in);
		int ch1,ch2;
		int amount;
		System.out.println("-------------------Welcome to Bank-------------------");
		System.out.println("Please select the bank which you want");
		System.out.println("Pres\n1-->SBI (Home Loan interest : 9  and car Loan interest : 10)\n2-->HDFC (Home Loan interest : 10  and car Loan interest : 7)\n3-->SBI (Home Loan interest : 8  and car Loan interest : 9)");
		ch1=sc.nextInt();
		
		if(ch1==1)
		{
			System.out.println("******Welcome To SBI******");
			
		}
		else if(ch1==2)
		{
			System.out.println("******Welcome To HDFC Bank******");
	
		}			
		else if(ch1==3)
		{
			System.out.println("******Welcome To AXIS Bank******");
			
		}
			
		while(true)
		{
			System.out.println("press\n1-->Credit\n2-->Withdraw\n3-->Check Balance\n4-->Take carloan\n5-->Take Home loan\n6-->Exit");
			ch2=sc.nextInt();
			switch(ch2)
			{
		 		case 1: System.out.println("Enter the amount you want to credit");
		 				amount = sc.nextInt();
		 				if(ch1==1)
		 					sb.addMoney(amount);
		 				else if(ch1==2)
		 					hd.addMoney(amount);
		 				else if(ch1==3)
		 					ax.addMoney(amount);
		 				break;
		 				
		 		case 2: System.out.println("Enter the amount you want to withdraw");
		 				amount = sc.nextInt();
		 				
		 				try {
		 						if(ch1==1)
		 							sb.withdraw(amount);
		 						else if(ch1 ==2)
		 							hd.withdraw(amount);
		 						else if(ch1==3)
		 							ax.withdraw(amount);
		 					} 
		 				catch (NotEnoughMoney e) 
		 					{
		 						System.out.println("Sorry You dont have enough amount");
		 					}
		 				break;
		 				
		 		case 3: if(ch1==1)
							sb.dispAcc();
						else if(ch1 ==2)
							hd.dispAcc();
						else if(ch1==3)
							ax.dispAcc();
		 				break;
		 				
		 		case 4:System.out.println("Enter the home loan do you want");
		 				int a = sc.nextInt();
		 		
		 				if(ch1==1)
		 					hp.hloan(sb, a);
						else if(ch1 ==2)
							hp.hloan(hd, a);
						else if(ch1==3)
							hp.hloan(ax, a);
		 				break;
		 		
		 		case 5:System.out.println("Enter the car loan do you want");
 						int b = sc.nextInt();
 		
 						if(ch1==1)
 							hp.cloan(sb, b);
 						else if(ch1 ==2)
 							hp.cloan(hd, b);
 						else if(ch1==3)
 							hp.cloan(ax, b);
 						break;
		 				
		 		case 6: System.out.println("Thank you For using our bank, Bye.");
		 				System.exit(0);
		 				break;
		 				
		 		default:
		 				System.out.println("Please enter valid number");
			}
		}
	}
}
