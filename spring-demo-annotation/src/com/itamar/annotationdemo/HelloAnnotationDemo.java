package com.itamar.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloAnnotationDemo {

	public static void main(String[] args) {
		
		//create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		Coach myCoach = context.getBean("footBallCoach", Coach.class);
		
		//perform an action on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		System.out.println(myCoach.getEmail());
		context.close();

	}

}
