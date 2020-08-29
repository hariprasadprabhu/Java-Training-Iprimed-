package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();//create session connect database and application and percistant transaction methods
		
		
		sf.close();
	}

}
