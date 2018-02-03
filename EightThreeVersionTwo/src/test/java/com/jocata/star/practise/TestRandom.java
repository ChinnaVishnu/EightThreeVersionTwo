package com.jocata.star.practise;

import java.util.Random;

import org.testng.annotations.Test;

public class TestRandom {

	
	
	public static void main(String[] args) {
		

		Random randomGenerator = new Random(); 
		
		
		int randomInt = randomGenerator.nextInt(100); 
		
		System.out.println(randomInt);
		

		}
	
}
