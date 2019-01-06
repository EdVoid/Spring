package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class SwimCoach implements Coach {
	
	@Value("${coach.email}")
	private String email;
	
	@Value("${coah.team}")
	private String team;
	
	private FortuneService fortuneService;
	
//	public SwimCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "20 laps bruh";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
