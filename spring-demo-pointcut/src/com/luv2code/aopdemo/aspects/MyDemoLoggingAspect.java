/**
 * 
 */
package com.luv2code.aopdemo.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

/**
 * @author mutsubra0
 *
 */
@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		
		//print class
		System.out.println(theProceedingJoinPoint.getSignature().toShortString());
		
		//begin timestamp
		long begin = System.currentTimeMillis();
		
		//now, let's proceed
		Object result = null;
		try {
			result = theProceedingJoinPoint.proceed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			//result = "Major Accdient !! Private vehicle pickup is on the way!!";
			
			throw e;
		}
		
		
		//end timestamp
		long end = System.currentTimeMillis();
		
		//compute duration
		long duration = begin - end;
		System.out.println("\n  Duration " + duration / 1000 + " seconds.");
		
		return result;
	}
	
	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		
		System.out.println("Executing afterFinallyFindAccountsAdvice method" + theJoinPoint.getSignature().toShortString());
	}
	
	@AfterThrowing(
				pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
				throwing="exc"
			)
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable exc) {
		
		System.out.println("Executing afterThrowingFindAccountsAdvice method" + theJoinPoint.getSignature().toShortString());
		
		System.out.println("The exception is " + exc);
	}
	
	@AfterReturning(
				pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
				returning="result"
			)
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
		
		System.out.println(theJoinPoint.getSignature().toShortString());
		
		System.out.println("result is " + result);
		
		//let's post-process the data
		convertAccountNamesToUpperCase(result);
		
	}
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for (Account tempAccount : result) {
			String theUpperName = tempAccount.getName().toUpperCase();
			tempAccount.setName(theUpperName);
		}
	}

	@Before("com.luv2code.aopdemo.aspects.LuvAOPExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n===>> Executing Logging aspect");
		
		//display the method signature
		MethodSignature theMethodSig = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method + " + theMethodSig);
		
		//display method arguments
		Object[] args = theJoinPoint.getArgs();
		for (Object tempArg : args) {
			System.out.println(tempArg);
			
			if (tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				System.out.println("account name" + theAccount.getName());
				System.out.println("account level" + theAccount.getLevel());
			}
			
		}
	}
	
}
