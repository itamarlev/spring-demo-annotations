package com.itamar.annotationdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email.amdocs}")
	private String email;
	
	public String getEmail() {
		return email;
	}
	
	@PostConstruct
	public void doMyStartup()
	{
		System.out.println("doing starting up");
	}

	@PreDestroy
	public void doMyCleanup()
	{
		System.out.println("doing cleanup");	
	}
	
	@Autowired
	@Qualifier("randomFortuneFromFileService")
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
