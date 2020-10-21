package com.syntax.class06;

public class NotMoreExamples {

	public static void main(String[] args) {
		
		boolean isJavaEasy=false;
		
		if(!isJavaEasy) {
			System.out.println("Please spend more time with Java");
		}
		
		System.out.println("-------------------------------------------------");
		
		String day="Sunday";
		
		// SAY: IF ITS NOT SUNDAY, I HAVE TO GO to WORK
		
		if(!(day.equals("Sunday") || day.equals("Saturday"))) {
				
			System.out.println("I have to go to work");
		}

	}}


