package com.syntax.class08;
import java.util.Scanner;

public class TaskHW2 {

	public static void main(String[] args) {
		// keep asking user to apply for CC   // DO! WHILE ->>>
		
	//->>	//as soon as you get "yes" from a user - program should stop asking
		
		String response;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Do you want to apply for a CC");
			response=scan.nextLine();
		}while(!response.equals("yes"));
		
		System.out.println("You are selected");
		
		
		
		
		
		

	}

}
