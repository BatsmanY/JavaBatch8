package allAssignmentsFrom029;

import java.util.Scanner;
public class A029 {

	public static void main(String[] args) {
		
		//Your program should ask "Please enter first number" - for the 1st number 
		//and "Please enter second number" - for the 2nd number.
		
		
        Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int x=input.nextInt();
		
		System.out.println("Please enter second number");
		int y=input.nextInt();
		
		
		// Create if condition to check if the multiplication of x and y values is positive or negative.
		// If the result of a multiplication is positive print true, otherwise print false.
		
		double mult=x*y;
		
		
		if(mult>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}
