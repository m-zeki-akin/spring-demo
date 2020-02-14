package com.springdemo.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Track Coach Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
