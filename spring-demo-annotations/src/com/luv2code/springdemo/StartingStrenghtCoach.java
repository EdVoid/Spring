package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class StartingStrenghtCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "SQUATS AND OATS, LOWER LOWER LOOOOOWER!!!!!!";
	}

}
