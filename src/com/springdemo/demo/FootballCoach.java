package com.springdemo.demo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Football Coach Workout";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
