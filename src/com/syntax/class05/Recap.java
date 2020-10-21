package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		//Capture sentence: 
		System.out.println("please enter any sentence");
		String sentence=scanner.nextLine();
		System.out.println("You entered sentence: "+sentence);
	
		
		//I want to capture number:
		int number=scanner.nextInt();
		System.out.println("You entered number: "+number);
		
		//I want to capture 1 word:
		System.out.println("please enter any word");
		String word=scanner.next();
		System.out.println("You entered word: "+word);
		//I want to capture 1 character
		System.out.println("please enter any single character");
		char singleCharacter=scanner.next().charAt(0);
		System.out.println("You entered character: "+singleCharacter);
		
		
		
		
		

	}

}
