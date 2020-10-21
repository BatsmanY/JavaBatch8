package com.syntax.class06;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
	//#1: if no sale in the store --> no shopping
	    //if sale --> we go for shopping
	
	//#2: if sale - ask for the price
	      // if P= 10-50  - 10% discount
	     // if P= 50-100  - 20% discount
	      // if P= 100-500  - 40% discount
	      //if P>500  - 50% discount
	//CALCULATE FINAL PRICE AFTER DISCOUNT
	
	boolean sale;
	double price, discount, finalPrice;
	
	Scanner input=new Scanner(System.in);
    System.out.println("Please tell me if you have sale today");
     sale=input.nextBoolean();

	
	if(!sale) {
		System.out.println("No shopping!!");
	}else {
		System.out.println("Please enter the price");
		price=input.nextDouble();
		
		if(price>=10 && price<50) {
			discount=price*0.1;
		}else if(price>=50 && price<100) {
			discount=price*0.2;
		}else if(price >=100 && price<500) {
			discount=price*0.4;
		}else if(price>=500) {
			discount=price*0.5;
		}else {
			discount=0;
		}
		
		finalPrice=price-discount;
		System.out.println("Your product price is $"+price+" and you get $"+discount+" discount "+"and you pay only "+finalPrice);
		
	}
	
	}

}
