package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		// If loan is less or equal to 200,000 then you would lend the money 
		// otherwise you would reject the client
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the amount of loan that needed");
		int loan=input.nextInt();
		
		if(loan<=200000) {
			System.out.println("I will lend you money");
			}else {
				System.out.println("Sorry I will not lend you money");
			}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
