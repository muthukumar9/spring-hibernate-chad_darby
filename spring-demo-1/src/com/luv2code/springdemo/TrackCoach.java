package com.luv2code.springdemo;

import com.luv2code.springdemo1.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	/**
	 * @param fortuneService
	 */
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!!";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It !!" + fortuneService.getFortune();
	}

	//add an init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	//add an destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
}
