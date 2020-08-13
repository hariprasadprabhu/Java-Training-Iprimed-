package empex.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public abstract class Emp implements Serializable{
	String name;
	int age;
	int salary;
	String designation;
	Emp()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter Name: ");
			name=br.readLine();
			System.out.println("Enter Age: ");
			age=br.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void display()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nDesignation: "+designation);
	}
	
	public abstract void raiseSalary();

}
