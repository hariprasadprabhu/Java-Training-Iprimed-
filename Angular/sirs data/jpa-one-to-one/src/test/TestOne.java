package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import entity.Course1;
import entity.Student;

public class TestOne {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		/*
		 * EntityTransaction et = em.getTransaction(); et.begin(); Student std = new
		 * Student(); std.setId(1); std.setName("SURESH");
		 * 
		 * Student std1 = new Student(); std1.setId(2); std1.setName("RAMESH");
		 * 
		 * em.persist(std); em.persist(std1);
		 * 
		 * Course1 c = new Course1(); c.setC_id(10); c.setC_name("java"); c.setStd(std);
		 * 
		 * Course1 c2 = new Course1(); c2.setC_id(20); c2.setC_name("C++");
		 * c2.setStd(std1);
		 * 
		 * em.persist(c); em.persist(c2);
		 */

		Student st = (Student) em.find(Student.class, 1);
		System.out.println(st.getId() + " " + st.getName());

		Course1 c1 = (Course1) em.find(Course1.class, 10);
		System.out.println(c1.getC_id() + " " + c1.getC_name() + c1.getStd().getName());

		//et.commit();

		em.close();
		emf.close();

	}

}
