package com.syntax.class07;
import java.util.Scanner;
public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		//play a lottery where we need to enter number from 1 to 100
		// lucky number is 7
		//keep asking user to enter number until entered num is the same as the lucky num
			
		Scanner scan;
		int numberFromUser;
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the number 1 to 100");
		numberFromUser=scan.nextInt();
		
		
		while(numberFromUser!=luckyNumber) {
			System.out.println("Please enter the number 1 to 100");
			numberFromUser=scan.nextInt();
		}
		
		
	}

}
