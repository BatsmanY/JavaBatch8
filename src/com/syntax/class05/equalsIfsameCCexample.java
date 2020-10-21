package com.syntax.class05;

import java.util.Scanner;

public class equalsIfsameCCexample {

	public static void main(String[] args) {
		/*
		 * ask if user has a CC or not if doesn't - offer them if they do have one - ask
		 * what is the balance on the CC if balance>1000 tell them to pay it off
		 * immediately otherwise tell them that they can spend more
		 */

		Scanner scan;
		String answer; // declare here
		double balance; // for numbers// declare here

		scan = new Scanner(System.in);
		System.out.println("Please enter if you have a CC (true/false)");

		answer = scan.next(); // to capture boolean value and store it inside the answer

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your card?");// if they do have one//answer=true
			balance = scan.nextDouble();// capture the balance
			if (balance > 1000) {
				System.out.println("Please pay off your CC balance");
			} else {
				System.out.println("You can spend more money");
			}

		} else {
			System.out.println("Would you like to get a CC?");
		}

	}

}







