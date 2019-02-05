/**
 * 
 */
package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author mutsubra0
 *
 */
@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("execution(* add*(com.luv2code.aopdemo.Account))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n===>> Executing @Before advice on addAccount()");
		
	}
}
