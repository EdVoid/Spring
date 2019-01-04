package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
@Scope("Prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inisde default constructor");
	}
	
//	@Autowired 
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
//	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
//	
//	@Autowired 
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inisde setFortuneService method");
//		this.fortuneService=fortuneService;
//	}
           
}
