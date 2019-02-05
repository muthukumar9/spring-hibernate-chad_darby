/**
 * 
 */
package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author mutsubra0
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.FortuneService#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Today is your lucky day!!";
	}

}
