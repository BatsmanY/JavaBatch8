package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		int num1=180;
		int num2=900;
		
		System.out.println("writing my first if statement");
		
		if(num1>num2)//if false //{}will not be executed
			{
			System.out.println("Num1 is bigger than num2");
			
		}
		
		System.out.println("End of if statement");
		System.out.println("------------------------------------------------------------");
		
		int temp=60;
		if(temp>=60) {
			System.out.println("I'm going to the beach");
		}else {
			System.out.println("I will go for a walk");
			
		}
			
			System.out.println("------------------------------------------------------------");
			double expectHours=15;
			double actualHours=2;
			
			if(actualHours>expectHours) {
				System.out.println("You will succeed");
			}else {
				System.out.println("Course will be to hard for you");
			}
			
			
	}

}
