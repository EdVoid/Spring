package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StartingStrenghtCoach implements Coach {
    FortuneService fortune;
	@Override
	public String getDailyWorkout() {
		return "SQUATS AND OATS, LOWER LOWER LOOOOOWER!!!!!!";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomeCrazyStuff(FortuneService fService) {
		System.out.println(">> StartingStrenghtCoach: inisde random method with Autowired");
		fortune = fService;
	}

}
