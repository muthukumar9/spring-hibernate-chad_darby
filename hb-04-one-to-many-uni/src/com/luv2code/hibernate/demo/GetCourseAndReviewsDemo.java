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
import com.luv2code.hibernate.demo.entity.Review;

/**
 * @author mutsubra0
 *
 */
public class GetCourseAndReviewsDemo {

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
									.addAnnotatedClass(Review.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		try {
			
			//start a transaction
			session.beginTransaction();
			
			Course myCourse = session.get(Course.class, 10);
			
			System.out.println("Courses" + myCourse);
			System.out.println("Reviews" + myCourse.getReviews());
			
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
