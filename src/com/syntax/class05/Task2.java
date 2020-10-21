package com.syntax.class05;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// Write a program for user to enter his/hers birth month. 
		//Based on the month define the season.
		//Example: if user is born in June, July or August  season =”Summer”.
		//At the end of the program we should see output as “You were born ______”.
		
		Scanner scan;
		String month;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		month=scan.next();
		
		if(month.equalsIgnoreCase("december")||month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")) {
			System.out.println("You were born in winter");
		}else if(month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")) {
			System.out.println("You were born in spring");
		}else if(month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")) {
			System.out.println("You were born in summer");
		}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")) {
				System.out.println("You were born in fall");
		}
		
		
	}

}
