package com.itamar.annotationdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "go running";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	

}
