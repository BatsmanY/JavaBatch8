package com.syntax.class05;
import java.util.Scanner;
public class bonusEmployTask {

	public static void main(String[] args) {
		
		/*Write a program to ask user to enter numbers of worked years(wY) and annual salary.
		 *  If user worked for more or equals to 5 years than user is eligible for the bonus,otherwise he is not.
		 *   Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 *   otherwise bonus=3000.--
		 */
		Scanner scan;
		double wY; 
		int salary;

		scan = new Scanner(System.in);
		System.out.println("Please enter number of worked years");
       
		wY=scan.nextDouble();
		
        if(wY>=5) {
        	System.out.println("You are eligible for the bonus");
        	System.out.println("How big is your salary?");
    		salary=scan.nextInt();
        	
        	if(salary>50000) {
        		System.out.println("Your bonus is $5,000");	
        	}else {
        		System.out.println("Your bonus is $3,000");
        	}
        	
        	
        }else {
        	System.out.println("You are not eligible for the bonus");
        }
	
	}

}

		
		
		
		
		
		
		
		
		
		
		