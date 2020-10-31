package com.syntax.class09;

public class NestedLoopMore {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
		
		for (int j=1; j<=4; j++) {
			
			System.out.println("i ="+i+" j="+j);
			
		}
			System.out.println(); // spacing in between
		}
		
		System.out.println("--------print numbers from 10 to 99 using nested loop---------");
		
	//REGULAR WAY
		for (int a=10; a<=99; a++) {
			System.out.print(a+".");
		}
		
		
		//NESTED FOR LOOP
		
	
		for (int a=1; a<=9; a++) {            //  pervaya cifra v 4isle 
			for (int b=0; b<=9; b++) {       //  vtoraya cifra v 4isle 
				System.out.println(a+""+b);
			}
			
		}
		
		
		
		
		

	}

}
