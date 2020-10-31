package com.syntax.class08;

import java.util.Scanner;

public class TaskHW3 {

	public static void main(String[] args) {
		/*Write a program that reads a range of integers (start and end point), provided by a user
		 * from that range prints the sum of the even and odd integers.
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter start point");
		int startPoint=scan.nextInt();
		
		System.out.println("Enter end point");
		int endPoint=scan.nextInt();
		
		int sumO=0;   int sumE=0;
		
		for (int a=startPoint; a<=endPoint; a++ ) {
			if(a%2==0) {
				sumE+=a; // the same-> sumE=a+sumE
			}else {
				sumO+=a; // the same-> sumO=a+sumO
			}
		}
		
		System.out.println("The sum of even numbers from "+startPoint+" to "+endPoint+" is "+sumE);  
		System.out.println("The sum of odd numbers from "+startPoint+" to "+endPoint+" is "+sumO);  
		
		
		
		
		

	}

}
