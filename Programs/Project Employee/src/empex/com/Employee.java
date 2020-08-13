package empex.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	
	public static void main(String[] args) throws Exception
	{
		int ch1=0,ch=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Emp> a =null;
		File f = new File("Employee.ser");
		if(f.exists())
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Employee.ser"));
			a=(ArrayList<Emp>) ois.readObject();
			ois.close();
		}
		else
		{
			a=new ArrayList<Emp>();
		}
		
		
		do {
			System.out.println("--------------Welcome--------------");
			System.out.println("\nEnter\n1-->Create\n2-->Display\n3-->Raise Salary\n4-->Exit");
			System.out.println("-----------------------------------");
			ch=Integer.parseInt(br.readLine());
			if(ch==1)
			{
				do {
					System.out.println("-----------------------------------");
					System.out.println("press\n1-->Cleark\n2-->Manager\n3-->Programmer\4-->Exit");
					System.out.println("-----------------------------------");
					ch1 = Integer.parseInt(br.readLine());
					switch(ch1)
					{
					case 1:a.add(new Cleark());
						break;
					case 2:a.add(new Manager());
						break;
					case 3:a.add(new Programmer());
						break;
					default:System.out.println("Enter a proper choice");
					}
				}while(ch1!=4);
					
			}
			else if(ch==2)
			{
				Iterator<Emp> itr =a.iterator();
				while(itr.hasNext())
				{
					itr.next().display();
				}
			}
			else if(ch==3)
			{
				Iterator<Emp> itr =a.iterator();
				while(itr.hasNext())
				{
					itr.next().raiseSalary();
				}
			}
			
		}while(ch!=4);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.ser"));
		oos.writeObject(a);
		oos.close();
	}

}
