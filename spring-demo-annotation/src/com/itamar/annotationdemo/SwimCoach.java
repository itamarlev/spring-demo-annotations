package com.itamar.annotationdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;	
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "swim allot";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		return email;
	}

}
