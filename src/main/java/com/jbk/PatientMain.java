package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PatientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		
		Patient p=new Patient();
		p.setId(1);
		p.setName("Kirti");
		p.setCity("ALephata");
		p.setAge(21);
		p.setBloodgrp("A+");
		s.save(p);
		
		
		System.out.println("Data inserted successfully..");
		t.commit();
		s.close();
	}

}
