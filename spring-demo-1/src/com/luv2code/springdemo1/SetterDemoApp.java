/**
 * 
 */
package com.luv2code.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mutsubra0
 *
 */
public class SetterDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		//CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		GolfCoach theCoach = context.getBean("golfCoach", GolfCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		/*System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		*/
		//close the context
	}

}
