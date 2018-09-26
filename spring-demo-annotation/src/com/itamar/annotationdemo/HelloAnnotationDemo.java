package com.itamar.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloAnnotationDemo {

	public static void main(String[] args) {
		
		//create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		//Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach myCoach = context.getBean("myCricketCoach", Coach.class);
		
		//perform an action on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		
		context.close();

	}

}
