/**
 * 
 */
package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.service.TrafficFortuneService;

/**
 * @author mutsubra0
 *
 */
public class AroundDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//read the spring config java clas
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("Calling Fortune Service");
		
		String result = trafficFortuneService.getFortune();
		
		System.out.println("Result --> " + result);
		
		//close the context
		context.close();
	}

}
