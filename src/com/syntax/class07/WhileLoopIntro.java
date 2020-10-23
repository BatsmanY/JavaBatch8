package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
		int time=15;
		
		if(time>12) {
			System.out.println("good day");}
		
		
		System.out.println("---------------WHILE LOOP------------------");
		
		
		//executes same block of code WHILE our condition is TRUE
		
	
		
	while(time>12) {
		System.out.println("good day"); // how many times will execute here? INFINITE
		time++;                         // in this case my condition will never become False ->> infinite loop
	}
	while(time>12) {
		System.out.println("good day"); 
		time--;                          //how many times will execute if time=15 ->> 3 times
	}
	
	     

	}

}
