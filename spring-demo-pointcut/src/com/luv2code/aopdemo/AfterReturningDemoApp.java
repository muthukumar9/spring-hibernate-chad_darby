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
public class AfterReturningDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//read the spring config java clas
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccount = accountDAO.findAccounts(false);
		
		System.out.println("\n\n Main Program: AfterReturningDemoApp");
		System.out.println("---");
		
		System.out.println(theAccount);
		
		//close the context
		context.close();
	}

}
