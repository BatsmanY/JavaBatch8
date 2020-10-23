package com.syntax.class07;

public class WhileLoop3 {

	public static void main(String[] args) {
		// print from 100 to 1 (odd numbers only)
		
		int a=100;
		while(a>=1) {
			if(a%2==1) {     //OR (a%2)!=0
				
			System.out.print(a+" ");
			}
			a--;
		}
		
		//another way
		int b=99;
		while(b>0) {
			System.out.print(b+" ");
			b-=2;		
		}
	}

}
