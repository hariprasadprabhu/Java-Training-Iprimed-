import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
public static void main(String[] args)
 {
	String iMEICode,processor,manufactrer;
	  double price;
	  boolean isSingleSim;
  Scanner sc=new Scanner(System.in);
  Mobile[] m =new Mobile[5];
  for(int i=0;i<1;i++)
  {
	  iMEICode=sc.next();
	  isSingleSim=sc.nextBoolean();
	  processor=sc.next();
	  price=sc.nextDouble();
	  manufactrer=sc.next();
	  m[i]=new Mobile(iMEICode, processor, manufactrer, price, isSingleSim);
  }
  double discPerc=sc.nextDouble();
  String  mname=sc.next();
  int res1=getCountOfValidIMEIMobiles(m);
  System.out.println(res1);
  Mobile mm=findMobileWithMaxPrice(m, discPerc, mname);
  if(mm==null)
	  System.out.println("No mobile found");
  else
  {
	  System.out.println(mm.iMEICode+"@"+mm.price);
  }
 }

 public static int getCountOfValidIMEIMobiles(Mobile[] listOfMobiles)
  {
	 int cnt=0;
	 for(int i=0;i<listOfMobiles.length;i++)
	 {
		
		 String ss=listOfMobiles[i].iMEICode;
		 if(ss.length()==15 && listOfMobiles[i].isSingleSim==true)
		 {
			 cnt++;
		 }
	 }
	 return cnt;
  }

public static Mobile findMobileWithMaxPrice(Mobile[] listOfMobiles,double discountPercentage,String manufacturerName)
  {
	Mobile m=null;
	for(int i=0;i<listOfMobiles.length;i++)
	{
		if(manufacturerName.equalsIgnoreCase(listOfMobiles[i].manufactrer))
		{
			double amt= listOfMobiles[i].price-(listOfMobiles[i].price*discountPercentage/100);
			if(m!=null)
				m=listOfMobiles[i];
			else
				if(m.price<listOfMobiles[i].price)
					m=listOfMobiles[i];
		}
	}
	return m;
	
  }
}
class Mobile
{
  String iMEICode,processor,manufactrer;
  double price;
  boolean isSingleSim;
public Mobile(String iMEICode, String processor, String manufactrer, double price, boolean isSingleSim) {
	super();
	this.iMEICode = iMEICode;
	this.processor = processor;
	this.manufactrer = manufactrer;
	this.price = price;
	this.isSingleSim = isSingleSim;
}
public String getiMEICode() {
	return iMEICode;
}
public void setiMEICode(String iMEICode) {
	this.iMEICode = iMEICode;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public String getManufactrer() {
	return manufactrer;
}
public void setManufactrer(String manufactrer) {
	this.manufactrer = manufactrer;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isSingleSim() {
	return isSingleSim;
}
public void setSingleSim(boolean isSingleSim) {
	this.isSingleSim = isSingleSim;
}
  
}
