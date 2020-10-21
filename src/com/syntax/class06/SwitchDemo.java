package com.syntax.class06;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * ask the Tester - which browser they would like to use
		 * 
		 * 
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		browser=scan.nextLine();
		
		
		switch(browser) {
		case "safari":
			message="Your code will be executed in Safari browser";
			break;
		case "chrome":
			message="Your code will be executed in Chrome browser";
			break;
		case "firefox":
			message="Your code will be executed in firefox browser";
			break;	
			default:
				message="Entered browser is not supported";
		}
		System.out.println(message);
		
		

	}

}
