/**
 * 
 */
package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

/**
 * @author mutsubra0
 *
 */
public class CreateCoursesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		try {
			
			//start a transaction
			session.beginTransaction();
			
			Instructor myInstructor = session.get(Instructor.class, 1);
			
			Course myCourse = new Course("Air Guitar -= Ultimate Class");
			Course myCourse2 = new Course("Pinball Class");
			
			myInstructor.addCourse(myCourse);
			myInstructor.addCourse(myCourse2);
			
			session.save(myCourse);
			session.save(myCourse2);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done !!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

}
