package com.syntax.class06;
import java.util.Scanner;
public class TaskCalculatorSwitch {

	public static void main(String[] args) {
		/*
		 * Using scanner create CALCULATOR 
		 * Ask user to enter 2 numbers and 1 operator (+,-,*,/)
		 * Provide the result
		 */
	
		
		double result;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		double num1=scan.nextDouble();
		
		System.out.println("Please enter second number");
		double num2=scan.nextDouble();
		
		System.out.println("enter operator");
		char operator=scan.next().charAt(0);
		scan.close();
		
		double ma=0;
		
		switch (operator) {
		case '+':
			ma=num1+num2;
			break;
		case '-':
			ma=num1-num2;
			break;
		case '*':
			ma=num1*num2;
			break;
		case '/':
			ma=num1/num2;
		break;
		default:
			System.out.println("invalid");
		}
		if(ma!=0) {
			
		System.out.println("The result is = "+ma);
		}
		
	}

}
