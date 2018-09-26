package com.itamar.annotationdemo;

public class FootBallCoach implements Coach {

	private FortuneService fortuneService;

	public FootBallCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "kick the ball";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
