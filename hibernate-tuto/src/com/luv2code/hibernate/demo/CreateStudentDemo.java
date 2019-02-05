/**
 * 
 */
package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

/**
 * @author mutsubra0
 *
 */
public class CreateStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		try {
			
			String dateStr = "31/12/1998";
			Date dateOfBirth = DateUtils.parseDate(dateStr);
			
			//create a student object
			Student newStudent = new Student("Paul", "Smith", "paul.s@gmail.com", dateOfBirth);
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(newStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
	}

}
