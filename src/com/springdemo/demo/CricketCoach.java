package com.springdemo.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	private String emailAddress;

	public CricketCoach() {
		System.out.println("I'm inside of the no-arg constructor.");
	}

	public FortuneService getFortuneService() {
		return this.fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I'm inside of the setter method.");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
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
