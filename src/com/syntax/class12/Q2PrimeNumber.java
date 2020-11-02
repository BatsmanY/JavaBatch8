package com.syntax.class12;


public class Q2PrimeNumber {

	public static void main(String[] args) {
		// check whether a given number is prime number or not
		//prime ->> greater than 1, should be divisible by itself only and by 1 
		//2,3,5,7,11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		// 1 is not the prime number!
		
		int num=2;
		boolean flag=false;
		
		if (num>1) {
		for(int i=2; i<num; i++) {
			//condition for non-prime number
			if(num%i==0) {
				flag=true;
				break;
			}
		}} else {flag=true;
		
			
		}
		
		
		
		if(!flag)
			System.out.println(num+" is a prime number.");
		else
			System.out.println(num+" is not a prime number.");
		
		
		
		
		
	}

}
