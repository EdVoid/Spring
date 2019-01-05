package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		Coach secondCoach = context.getBean("thatSillyCoach", Coach.class);
		boolean result = (coach == secondCoach);
		
		
		// print the results
		
		System.out.println("Pointing to the same object? "+result);
		
		System.out.println("Memory location for coach"+ coach);
		System.out.println("Memory location for secondCoach"+ secondCoach);
		System.out.println("Coach gib gf pls \n"+ coach.getDailyFortune());
		System.out.println("secondCoach gib gf pls \n"+ secondCoach.getDailyFortune());

		context.close();

	}

}
