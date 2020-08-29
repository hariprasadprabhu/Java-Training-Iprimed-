package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Employee;

public class Test 
{
	public static void main(String[] args)throws Exception 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("pu");
		EntityManager entitymanager=factory.createEntityManager();
		EntityTransaction et=entitymanager.getTransaction();
		et.begin();
		
		Employee emp=new Employee();

		emp.setEname("santhosh");
		emp.setEsal(132465);
		emp.setEadd("banglore");
		
		entitymanager.persist(emp);
		et.commit();
		System.out.println("Object inserted");

		
		
		
		
	}
}
