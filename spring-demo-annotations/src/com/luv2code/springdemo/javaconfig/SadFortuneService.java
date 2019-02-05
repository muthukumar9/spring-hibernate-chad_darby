/**
 * 
 */
package com.luv2code.springdemo.javaconfig;

import com.luv2code.springdemo.FortuneService;

/**
 * @author mutsubra0
 *
 */
public class SadFortuneService implements FortuneService {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.FortuneService#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Today is a Sad day!!";
	}

}
