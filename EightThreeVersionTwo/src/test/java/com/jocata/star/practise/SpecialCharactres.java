package com.jocata.star.practise;

import java.util.Random;

public class SpecialCharactres {

	static String user="raghu";

	
public  static void stp(){
		
		

		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		System.out.println(user+output);
		
		System.out.println(user+output+"@gmail.com");

		}	

public static void main(String[] args) {
	SpecialCharactres.stp();
	
	
}
	
	
}
