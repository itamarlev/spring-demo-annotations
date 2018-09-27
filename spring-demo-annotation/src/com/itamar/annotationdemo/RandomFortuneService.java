package com.itamar.annotationdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
				"I'm your first fortune",
				"don't rest during the day",
				"you are great"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = random.nextInt(data.length);
		return data[index];
	}

}
