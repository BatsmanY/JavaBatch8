package com.syntax.class07;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		
	//play a lottery where we need to enter number from 1 to 20
	// lucky number is 7
	//keep asking user to enter number until entered num is the same as the lucky num
		
		
		Scanner scan;
		int numberFromUser;
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter the number 1 to 20");
			numberFromUser=scan.nextInt();
			
		}while(numberFromUser!=luckyNumber);      //  7!=7 - False -->  condition will stop looping 
		System.out.println("You guessed the right number");
		
		
		
		

		
	}

}
