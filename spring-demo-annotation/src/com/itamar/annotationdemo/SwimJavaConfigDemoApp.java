package com.itamar.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean
		Coach myCoach = context.getBean("pingpongCoach", Coach.class);
		
		//perform an action on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		System.out.println(myCoach.getEmail());
		context.close();

	}

}
