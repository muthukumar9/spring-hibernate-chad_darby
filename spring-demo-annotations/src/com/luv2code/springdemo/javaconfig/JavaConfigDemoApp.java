/**
 * 
 */
package com.luv2code.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.Coach;

/**
 * @author mutsubra0
 *
 */
public class JavaConfigDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
