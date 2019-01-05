package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	// load an array of strings
	@Value("${fortuneService.fortunes}")
	private String [] data;
	
	// create a random number generator
	private Random myRandom = new Random(); 
	
	@Override
	public String getFortune() {
		// pick a random fortune from the data array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}


}
