package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		//break is the key word
		
		for(int i=1; i<4; i++) {
			System.out.println("Hello");
			break;
		}
		
		//we want to print 1-10
		//when num=5 we want to break the Loop
		
       for(int i=1; i<=10; i++) {
		
		if(i==5) {
			break;
		}
		System.out.println(i);
       }
		
	}

}
