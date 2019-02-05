/**
 * 
 */
package com.luv2code.springdemo1;

/**
 * @author mutsubra0
 *
 */
public class HappyFortuneService implements FortuneService {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo1.FortuneService#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Today is your lucky day !!";
	}

}
