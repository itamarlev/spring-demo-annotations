package com.itamar.annotationdemo;

public class PingpongCoach implements Coach {

	private FortuneService fortuneService;
	
	public PingpongCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "play pingpong man";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		return "great mail";
	}

}
