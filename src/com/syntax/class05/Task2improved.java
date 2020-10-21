package com.syntax.class05;
import java.util.Scanner;
public class Task2improved {

	public static void main(String[] args) {
		// Write a program for user to enter his/hers birth month. 
				//Based on the month define the season.
				//Example: if user is born in June, July or August  season =”Summer”.
				//At the end of the program we should see output as “You were born ______”.
				
				Scanner scan;
				String month;
				String season; //ADDED NEW   
				
				scan=new Scanner(System.in);
				
				System.out.println("Please enter your birth month");
				month=scan.next();
				
				if(month.equalsIgnoreCase("december")||month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")) {
					season="winter";//NEW
					
				}else if(month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")) {
					season="spring";//NEW
					
				}else if(month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")) {
					season="summer";//NEW
					
				}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")) {
						season="fall";//NEW
				}else {
					season="invalid";
				}
				
System.out.println("You were born in "+season);
	}

}
