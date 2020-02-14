package com.springdemo.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("I'm inside of the no-arg constructor.");
	}

	public void setCricketCoach(FortuneService fortuneService) {
		System.out.println("I'm inside of the setter method.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Coach Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
