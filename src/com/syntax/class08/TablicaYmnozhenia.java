package com.syntax.class08;
import java.util.Scanner;
public class TablicaYmnozhenia {

	public static void main(String[] args) {
		
		//regular way no scanner in class SumOfOdd8SumOfEven
		
		// Create multiplication table 1 to 10
	       /* 1x1=1    //only num2 is changing
	       * 1x2=2
	       * 1x3=3
	       */
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter which number");
		
			int num1=scan.nextInt();
			
			for (int num2=1; num2<=10; num2++) {
				
				int mult=num1*num2;
				
				System.out.println(num1+"x"+num2+" = "+mult);
			}

	}

}
