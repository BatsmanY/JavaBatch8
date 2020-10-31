package com.syntax.class08;
import java.util.Scanner;
public class TaskHW4 {

	public static void main(String[] args) {
		/*ask a user to enter item they want to buy and the price of that item
		 * 
		 *  Every time user enters money accumulate the amount and tell the user how much is left to pay off. 
		 *  If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */

		Scanner scan;
		scan=new Scanner(System.in);
		
		String item;
		int price = 0; int money;
		
		System.out.println("Please enter item you want to buy");
		
		System.out.println("Please enter the price of that item");
		
		do{
			money=scan.nextInt();
		if(money>price) {
			System.out.println("Here is your change "+(money-price));
		}else if(money<price) {
			System.out.println("Please insert more money");}
			
		}while(money!=price);{
			System.out.println("Thank you for shopping!");
		}
			
		}
		
	}


