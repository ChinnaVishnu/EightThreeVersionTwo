package com.jocata.star.practise;

public class JavaStringArrayTests1 {

	
	private String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};

    // our constructor; print out the String array here
    public JavaStringArrayTests1()
    {
        // old `for` loop
        int size = toppings.length;
        
        
        for (int i=0; i<size; i++)
        {
            System.out.println(toppings[i]);
        }
    }

    // main kicks everything off.
    // create a new instance of our class here.
    public static void main(String[] args)
    {
        new JavaStringArrayTests1();
    }
}
