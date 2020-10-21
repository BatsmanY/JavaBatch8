package com.syntax.class05;
import java.util.Scanner;
public class LogicalAnd {

	public static void main(String[] args) {
		/*define whether number that is entered from user
		 * small number 1-10
		 * medium 11-100
		 * large 101-1000
		 */
		
		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number");
		number=input.nextInt();//must use Var that I said referred to my scanner
		//capture and store inside my box
		
		if(number>0 && number<=10) {
			System.out.println("You entered small number");
			
		}else if(number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if(number>100 && number<=1000) {
			System.out.println("You entered large number");
		}
		

	}

}
