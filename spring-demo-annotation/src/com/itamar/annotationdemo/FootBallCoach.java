package com.itamar.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
//
//	 @Autowired
//	public FootBallCoach(FortuneService fortuneService) 
//	{
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "kick the ball";
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		return email;
	}

}
