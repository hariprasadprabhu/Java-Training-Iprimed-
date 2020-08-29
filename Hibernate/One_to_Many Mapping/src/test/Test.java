package test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import entity.Department;
import entity.Employee;


public class Test {

public static void main(String[] args) {

EntityManagerFactory factory=Persistence.createEntityManagerFactory("pu");
EntityManager entitymanager=factory.createEntityManager();
EntityTransaction et=entitymanager.getTransaction();
et.begin();

Department d1=new Department();
d1.setD_id(101);
d1.setD_name("developer");

Department d2=new Department();
d2.setD_id(102);
d2.setD_name("tester");

entitymanager.persist(d1);
entitymanager.persist(d2);

ArrayList<Department> list=new ArrayList<Department>();
list.add(d1);
list.add(d2);

Employee emp=new Employee();
emp.setId(10);
emp.setName("Manoj");
emp.setDepartmet(list);

entitymanager.persist(emp);
et.commit();
System.out.println("Object inserted");

entitymanager.close();
factory.close();
}
}