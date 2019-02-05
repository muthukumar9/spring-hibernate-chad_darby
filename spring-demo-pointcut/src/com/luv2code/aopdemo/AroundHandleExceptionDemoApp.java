/**
 * 
 */
package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.service.TrafficFortuneService;

/**
 * @author mutsubra0
 *
 */
public class AroundHandleExceptionDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//read the spring config java clas
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("Calling Fortune Service");
		
		boolean tripWire = true;
		
		String result = trafficFortuneService.getFortune(tripWire);
		
		System.out.println("Result --> " + result);
		
		//close the context
		context.close();
	}

}
