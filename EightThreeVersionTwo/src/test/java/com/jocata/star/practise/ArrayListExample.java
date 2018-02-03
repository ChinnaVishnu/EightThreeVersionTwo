package com.jocata.star.practise;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] arguments){

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("hello");
        strings.add("world");
        strings.add("how");
        strings.add("are");
        strings.add("you?");

        for(int i = 0; i < strings.size(); i ++) {
        	
        	 System.out.print(i);
        	 
        	// break;
        	 
        }
        
        
       /* for (String s : strings){
            System.out.print(s + " ");
        }*/
    }
	
	
}
