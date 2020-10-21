package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter boolean value for rain");
		
		boolean rain=input.nextBoolean(); //waiting for my input + ENTER
		
		
	if(rain) {
		System.out.println("take umbrella");
	}else {
		System.out.println("nice weather, go for a walk");
	}
	System.out.println("-----------------------------lets capture integer value--------------");
	
	System.out.println("enter your name");
	String name=input.next();
	
	System.out.println("enter your age");
	int age=input.nextInt();
	
	System.out.println("your name is "+name+" you are "+age+" years old");	
		

	
	}

}
