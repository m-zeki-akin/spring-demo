package com.springdemo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCricketCoach {

	public static void main(String[] args) {
		// Load context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sport-context.xml");

		// Retreive bean
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

		// Use bean
		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		System.out.println(coach.getEmailAddress());

		System.out.println(coach.getTeam());

		// Close context
		context.close();

	}

}
