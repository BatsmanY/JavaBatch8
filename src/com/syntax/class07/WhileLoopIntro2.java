package com.syntax.class07;

public class WhileLoopIntro2 {

	public static void main(String[] args) {

		// I WANT TO PRINT NUMBERS FROM 10 TO 60

		int a = 10;

		while (a<61) {
			System.out.print(a+" "); // to print all numbers in 1 line 
			a++;
		}

		System.out.println();
		// I want to print numbers from 100 to 60  
		// DICREMENT =going down
		
		System.out.println(" PRINTING NUMBERS 100 TO 60 ---------------------");
		
		int b=100;
		while(b>=60) {
			System.out.print(b+" ");
			b--;
		}
		
		System.out.println();
		// I want to print from 10  to 30 only even numbers
		System.out.println(" ----------PRINTING NUMBERS 10 TO 30 ONLY EVEN----------------------");
		
		int c=10;
		
		while(c<31) {
			if(c%2==0) {
			
			System.out.print(c+" ");
		}
			
			c++; //PUT THIS AFTER WHILE LOOP
		}
		
		
		System.out.println("------------ANOTHER WAY-----------");
		
		int d=10;
		while(d<=30) {
			System.out.print(d+" ");
			d+=2;
		}
		
		
		
	}
}
