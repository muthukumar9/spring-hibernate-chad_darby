package com.luv2code.springdemo1;

import com.luv2code.springdemo.Coach;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	/**
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Hit 100 meters faster!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
