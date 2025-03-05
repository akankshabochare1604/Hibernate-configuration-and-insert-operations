package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("Akash");
		e.setCity("Pune");
		e.setDept("Mechanical");
		e.setSalary(25000);
		
		s.save(e);
		
		System.out.println("Data inserted..");
		t.commit();
		s.close();
		
	}
}
