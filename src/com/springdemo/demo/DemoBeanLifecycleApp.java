package com.springdemo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBeanLifecycleApp {

	public static void main(String[] args) {
		
		// Load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle-context.xml");
		
		// Create the beans
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// Use the beans
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getDailyWorkout());
		
		// Close the context
		context.close();
		
	}

}
