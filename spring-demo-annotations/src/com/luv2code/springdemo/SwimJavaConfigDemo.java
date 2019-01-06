package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);//get the bean from the spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		
		// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			
		// close context
			context.close();
	}

}
