package com.springdemo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBeanScopeApp {

	public static void main(String[] args) {
		
		// Load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-context.xml");
		
		// Create the beans
		Coach firstCoach = context.getBean("myCoach", Coach.class);
		
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are same
		boolean isEqual = (firstCoach == secondCoach);
		
		// Use the beans
		System.out.println(firstCoach.getDailyFortune());
		
		System.out.println(firstCoach.getDailyWorkout());
		
		System.out.println(secondCoach.getDailyFortune());
		
		System.out.println(secondCoach.getDailyWorkout());
		
		System.out.println("firstCoach and secondCoach are same object: " + isEqual);
		
		System.out.println("Memory Location of firstCoach" + firstCoach);
		
		System.out.println("Memory Location of secondCoach" + secondCoach);
		
		// Close the context
		context.close();
		
	}

}
