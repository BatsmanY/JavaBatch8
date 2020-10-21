package com.syntax.class06;
import java.util.Scanner;
public class Task2Grades {

	public static void main(String[] args) {
		/*allow user to enter grade. Explain following:
		 * A- Excellent, B- good, C- Average, D- Bad, 
		 * any other grade - not Acceptable.
		 * "you entered grade ... It is ... grade
		 */
		Scanner scan;
		char grade;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		case 'A':
			message="Excellent";
			break;
			
		case 'B':
			message="Good";
			break;
			
		case 'C':
			message="Average";
			break;
			
		case 'D':
			message="Bad";
			break;
			
			default:
				message="Not Acceptable";
		}
		
		System.out.println("you have entered grade "+grade+". It is "+message+" grade");
		
		
		
		
		
		
		
	}

}
