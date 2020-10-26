package com.syntax.class08;
import java.util.Scanner;
public class Recap {

	public static void main(String[] args) {
		
		/*ask user to pay for a water
		 * water price $5
		 * once user enters $$ amount we need to tell if we need more $$ or less
		 * once user gives us exact 5 then -> enjoy your water!
		 */
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		
		System.out.println("Please pay for a water");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			
			if(money>waterPrice) {
				System.out.println("This is too much, you need to insert less money");
				//money=input.nextInt();
				
			}else{
				System.out.println("Water is expensive, Please insert more money");
				//money=input.nextInt();		
			}
			money=input.nextInt();
		}
				
				System.out.println("enjoy your water!");
				
	}

}
