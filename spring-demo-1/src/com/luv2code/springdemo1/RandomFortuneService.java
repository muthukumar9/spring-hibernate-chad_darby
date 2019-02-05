package com.luv2code.springdemo1;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private Random myRandom = new Random();
	
	private String[] data = {
			"first",
			"second",
			"third"
	};
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
		
	}

}
