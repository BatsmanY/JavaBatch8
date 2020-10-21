package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("I will issue a driver license to you");
			}else {
				System.out.println("You can get a learners permit");
			}
		
		
	}

}
