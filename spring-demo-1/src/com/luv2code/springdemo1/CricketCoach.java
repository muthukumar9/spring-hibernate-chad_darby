/**
 * 
 */
package com.luv2code.springdemo1;

import com.luv2code.springdemo.Coach;

/**
 * @author mutsubra0
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mintues";
	}

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
