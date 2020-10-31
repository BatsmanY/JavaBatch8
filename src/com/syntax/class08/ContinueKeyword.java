package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		//continue will skip current iteration (=povtorenie)
		
		//Print numbers 1-5 except number 3
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("end of the loop");
		System.out.println("_________________________________________________");
		
		
		
		
		//Print numbers 1-10 except number 3 & 7

		for(int i=1; i<=10; i++) {
			if(i==3 || i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("end of the loop");
		
	}

}
