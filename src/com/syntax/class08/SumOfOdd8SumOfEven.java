package com.syntax.class08;

public class SumOfOdd8SumOfEven {

	public static void main(String[] args) {
		//CALCULATE SUM OF EVEN AND ODD NUMBERS (range 1-50)
		
				int sumO=0;
				int sumE=0;
				
				for (int a=1; a<51; a++) {
					
					if(a%2==0) {
						sumE=a+sumE;  //sumE+=a
					}else{
						sumO=a+sumO;  //sumO+=a
			     		}
					}
				
		System.out.println("The sum of even numbers from 1 to 50 is "+sumE);  //650
		System.out.println("The sum of odd numbers from 1 to 50 is "+sumO);  //625
		
		
		
		
		System.out.println("________________________________________________________");
		
		// Create multiplication table 1 to 10
       /* 1x1=1    //only num2 is changing
       * 1x2=2
       * 1x3=3
       */
		
		int num1=1; //can change this number to 2-9 to make different table parts
		
		for (int num2=1; num2<=10; num2++) {
			
			int mult=num1*num2;
			
			System.out.println(num1+"x"+num2+" = "+mult);
		}
		
		
		
		
		
    }
}