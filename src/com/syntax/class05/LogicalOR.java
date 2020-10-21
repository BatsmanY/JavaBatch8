package com.syntax.class05;
import java.util.Scanner;
public class LogicalOR {

	public static void main(String[] args) {
		
		String day="Saturday";
	
		
		if(day.equals("Saturday")||day.equals("Sunday"))
				{
			System.out.println("Today I have a Java class at Syntax");
		}
		
		
		System.out.println("The End");
		System.out.println("-------------------more examples------------------");
		
		/*if day is 1 or 5 --> I am off from Syntax
		 * if day is 2 or 3 --> GIT classes
		 * if day is 4 --> Review Class
		 * if day 6 or 7 --> Java class
		 * anything else will be invalid day
		 * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only");
		
		int today=scan.nextInt();
		if(today==1||today==5) {
			System.out.println("I am off from Syntax");
		}else if(today==2||today==3) {
			System.out.println("GIT classes");
		}else if(today==4) {
			System.out.println("Review class");
		}else if(today==7||today==7) {
			System.out.println("Java Class");
		}else {
			System.out.println("Invalid day, please enter a valid day 1-7");
		}
		
		
		
	}

}
