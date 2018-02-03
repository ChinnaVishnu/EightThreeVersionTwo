package com.jocata.star.practise;

import java.util.Random;

import org.testng.annotations.Test;

public class TestRandom4 {

	
	static String name="JOCATA";
	
	
      
	

	private static int getRandomNumberInRange(){
		
		
		
		Random randomGenerator = new Random(); 
		
		
		int Low = 29;
		int High = 1404;
		int Result = randomGenerator.nextInt(High-Low) + Low;
		
		int randomInt = randomGenerator.nextInt(1000); 
		
		
		
		return Result;
		

		}
	
	
	
	public static void main(String[] args) {
	
int randomnu=		getRandomNumberInRange();
		
System.out.println(name+randomnu);

	}
	
	
}
