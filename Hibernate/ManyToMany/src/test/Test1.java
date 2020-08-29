package test;

import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.BookHouse;
import entity.Student1;

public class Test1 {
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("pu");
		EntityManager entitymanager=factory.createEntityManager();
		EntityTransaction et=entitymanager.getTransaction();
		et.begin();
		Student1 s1 = new Student1();
		s1.setId(10);
		s1.setName("Hari");
		s1.setBook(null);
		Student1 s2 = new Student1();
		s2.setId(11);
		s2.setName("prasad");
		s1.setBook(null);
		entitymanager.persist(s1);

		entitymanager.persist(s2);
		
		ArrayList<Student1> list1 =new ArrayList<Student1>();
		ArrayList<Student1> list2 =new ArrayList<Student1>();
		
		list1.add(s1);
		list1.add(s2);
		
		list2.add(s1);
		list2.add(s2);
		
		BookHouse bh = new BookHouse();
		bh.setId(100);
		bh.setName("Rammandir");
		bh.setStd(list1);
		
		BookHouse bh1 = new BookHouse();
		bh1.setId(101);
		bh1.setName("shravya");
		bh1.setStd(list2);
		

		entitymanager.persist(bh);

		entitymanager.persist(bh1);
		et.commit();
		entitymanager.close();
		factory.close();
	}

}
