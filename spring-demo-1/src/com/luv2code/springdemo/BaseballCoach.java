package com.luv2code.springdemo;

import com.luv2code.springdemo1.FortuneService;

public class BaseballCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting pratice on Baseball Coach...";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to give fortune
		return fortuneService.getFortune();
	}
}