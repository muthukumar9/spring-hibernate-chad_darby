package com.luv2code.springdemo.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class AnnotationBeanScopeApp {

	public static void main (String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = theCoach == alphaCoach;
		System.out.println(result);
		
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		context.close();
	}
}
