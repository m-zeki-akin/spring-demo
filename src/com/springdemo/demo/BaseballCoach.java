package com.springdemo.demo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Baseball Coach Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
