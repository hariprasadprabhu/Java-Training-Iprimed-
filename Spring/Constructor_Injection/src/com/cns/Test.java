package com.cns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext ap= new ClassPathXmlApplicationContext("applicationContext.xml");
		Lion l=(Lion) ap.getBean("lion1");
		System.out.println(l);
	}

}
