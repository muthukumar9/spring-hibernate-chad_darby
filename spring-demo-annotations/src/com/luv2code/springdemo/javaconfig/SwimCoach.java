/**
 * 
 */
package com.luv2code.springdemo.javaconfig;

import org.springframework.beans.factory.annotation.Value;

import com.luv2code.springdemo.Coach;

/**
 * @author mutsubra0
 *
 */
public class SwimCoach implements Coach {

	private SadFortuneService sadFortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(SadFortuneService theSadFortuneService) {
		sadFortuneService = theSadFortuneService;
	}
	
	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Swim 100 meters as a warm up.";
	}

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		return sadFortuneService.getFortune();
	}

}
