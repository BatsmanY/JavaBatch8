package com.syntax.class04;

public class Task5 {

	public static void main(String[] args) {
		/*Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 *  otherwise user will consider buying. 
		 *  
		 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash.
		 */
		
		double mortRate=5.7;
		double mortPrice=250000;
		
		if(mortRate>4.5) {
			System.out.println("Dont buy a house");
			
		}else {
			System.out.println("Im thinking of buying");
			
			if(mortPrice>200000) {
				System.out.println("Take a loan");
				
			}else {
				System.out.println("pay cash");}

		}
	}
}
