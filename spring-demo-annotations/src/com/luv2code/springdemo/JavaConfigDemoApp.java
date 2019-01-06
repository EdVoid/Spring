package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);//get the bean from the spring container
		Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);
		
		Coach ssCoach = context.getBean("startingStrenghtCoach", Coach.class);
		// call a method on the bean
			System.out.println(tennisCoach.getDailyWorkout());
			System.out.println(tennisCoach.getDailyFortune());
			System.out.println("oh shit, rippletits is comming.... \n"+ ssCoach.getDailyWorkout());
			System.out.println(ssCoach.getDailyFortune());
			
		// close context
			context.close();
	}

}
