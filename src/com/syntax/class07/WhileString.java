package com.syntax.class07;

public class WhileString {

	public static void main(String[] args) {
		
		String day="Saturday";
		
		
		if(day.equals("Saturday")) {
			System.out.println("My favorite Java class"); //1 time print
		}
		
		
		while(day.equals("Saturday")) {
			System.out.println("My favorite Java class"); //infinite print
			day="Sunday";  //to stop INFINITE running
		}
		
	boolean isItBreakTime=false;
	if(isItBreakTime) {
		System.out.println("I will get tea");     //1 time print
	}else {
		System.out.println("I will continiue working");
	}
		
		while(isItBreakTime) {
			System.out.println("I will get tea"); //infinite print
			isItBreakTime=false;  //to stop INFINITE running
		}
		
		
		
		

	}

}
