package com.springdemo.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// Initialize TrackCoach (start up)
	public void initTrackCoach(){
		System.out.println("TrackCoach Initialized.");
	}
	
	// Destroy TrackCoach (clean up)
	public void destroyTrackCoach(){
		System.out.println("TrackCoach Destroyed.");
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
