/**
 * 
 */
package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author mutsubra0
 *
 */
@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*//@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	public TennisCoach() {
		
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("TennisCoach -- inside method doMyStartUpStuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Tennis Coach -- inside method doMyCleanUpStuff");
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Pratice for backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
