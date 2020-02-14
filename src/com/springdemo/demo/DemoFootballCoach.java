package com.springdemo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoFootballCoach {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sport-context.xml");

		FootballCoach coach = context.getBean("myFootballCoach", FootballCoach.class);

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		context.close();

	}

}
