package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// array of chars 
		//store grades into A,B,C,D,E,F
		//print grade B (use 2 different ways)
		
		//1st way
		
		char [] grades1= {'A', 'B','C','D','E','F'};
		System.out.println(grades1[1]);
	
		//second way
		
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		 System.out.println(grades[1]);
		
		

	}

}
