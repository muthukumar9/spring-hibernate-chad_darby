/**
 * 
 */
package com.luv2code.springdemo.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

/**
 * @author mutsubra0
 *
 */
public class BeanLifeCycleDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
