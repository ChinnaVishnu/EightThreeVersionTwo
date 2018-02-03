package com.jocata.star.practise;

import java.util.Random;

import org.testng.annotations.Test;

public class TestRandom3 {

	
	static String name="JOCATA";
	
	
      
	

	private static int getRandomNumberInRange(){
		
		
		
		Random randomGenerator = new Random(); 
		
		
		int randomInt = randomGenerator.nextInt(1000); 
		
		
		
		return randomInt;
		

		}
	
	
	
	public static void main(String[] args) {
	
int randomnu=		getRandomNumberInRange();
		
System.out.println(name+randomnu);

	}
	
	
}
