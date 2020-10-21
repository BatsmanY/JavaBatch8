package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print “The temperature in the city __ is __”
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your city");

		String city="city";
		
		
		
		System.out.println("please enter the outside temperature");
		
		
		
		double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        
        
        System.out.println("The Temperature in the "+city+" is "+celsius);      
        
		
		
		
		
		
		

	}

}
