package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		//create session factory
				SessionFactory factory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
				
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create a student object
			Student newStudent = new Student("Paul", "Smith", "paul.s@gmail.com", null);
			Student newStudent1 = new Student("Paul1", "Smith", "paul.s@gmail.com", null);
			Student newStudent2 = new Student("Paul2", "Smith", "paul.s@gmail.com", null);
			Student newStudent3 = new Student("Paul3", "Smith", "paul.s@gmail.com", null);
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(newStudent);
			session.save(newStudent);
			session.save(newStudent1);
			session.save(newStudent2);
			session.save(newStudent3);
			
			//commit transaction
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
	}

}
