package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Car c=new Car();
		c.setId(1);
		c.setModel("Fortuner");
		c.setColor("Black");
		c.setCompany("Toyota");
		c.setSpeed(200);
		s.persist(c);
		
		System.out.println(" Data inserted..");
		
		t.commit();
		s.clear();

	}

}

