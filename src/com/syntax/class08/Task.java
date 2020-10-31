package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1; i<6; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		int a;
		
		for(a=1; a<6; a++) {
			System.out.println("Value for a inside the loop "+a);
			
		}
		
		System.out.println("Value for a outside the loop "+a);
		
		System.out.println("____________________what will be the output____________________");
		
		int result=0;
		
		for(int i=10; i>=1; i--) {
			result*=i; 
			
		}
		System.out.println(result);
		
		
	}

}
