package com.syntax.class12;

public class Q3Fibonacci {
	public static void main(String[] args) {
		//print the first 10 numbers of Fibonacci series
		//is a series of numbers where a number is the addition/SUM of the last 2 numbers
		
		//(0),  1,1,2,3,5,8,13,21,34,55
		
		int a=0;
		int b=1;
		int sum;
		
		for (int i=1; i<=10; i++) {
			System.out.print(a+" ");
			sum=a+b;
	        a=b;
	        b=sum;
		
		
			
		}
		
	}

}
