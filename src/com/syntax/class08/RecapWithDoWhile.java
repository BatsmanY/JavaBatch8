package com.syntax.class08;

import java.util.Scanner;

public class RecapWithDoWhile {

	public static void main(String[] args) {
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for a water");
		                                                       //Which action will i do repeatedly?? ->>
	                                                      //-->> taking money and comparing the money to waterPrice
		 do{
        	money=input.nextInt();
        	
			if(money>waterPrice) {
				System.out.println("This is too much, you need to insert less money");
				
			}else if(money<waterPrice){
				System.out.println("Water is expensive, Please insert more money");}
			
		} while(money!=waterPrice);
        System.out.println("Enjoy your water!");
		
	}
}
