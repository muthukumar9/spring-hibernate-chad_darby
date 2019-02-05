/**
 * 
 */
package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

/**
 * @author mutsubra0
 *
 */
public class AfterThrowingDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//read the spring config java clas
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccount = null;
		try {
			boolean tripWire = true;
			theAccount = accountDAO.findAccounts(tripWire);
		} catch (Exception e) {
			System.out.println("\n\n Main Program - caught exception");
		}
		System.out.println("\n\n Main Program: AfterThrowingDemoApp");
		System.out.println("---");
		
		System.out.println(theAccount);
		
		//close the context
		context.close();
	}

}
