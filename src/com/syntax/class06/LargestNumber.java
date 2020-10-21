package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// FIND Largest Number

		Scanner scanner=new Scanner(System.in);
		double x, y, z, max;
		
		x=scanner.nextDouble();
		y=scanner.nextDouble();
		z=scanner.nextDouble();
		
		scanner.close();
		
		//  1st WAY
		
		if(!(x==y && y==z)) {
		
		if (x > y && x > z) {
			max = x;
		}else if(y > z) {
			max = y;
		}else{
			max = z;
		}
		System.out.println(max);
	}else{
		System.out.println("Numbers are equal");
		System.out.println("Largest value is "+x);
	}

	double biggest;

	System.out.println("-------------------COMPARING 2 numbers using NESTED IF------------------");

	// 2nd WAY

	if(x==y && y==z) {
		System.out.println("Numbers are equal");
	}else {
	
	if(x>y)
	{ // number 1 is larger than number 2
		if (x > z) {
			biggest = x;
		} else {
			biggest = z;
		}
	}else{ // number 2 is larger than number 1

		if (y > z) {
			biggest = y;
		} else {
			biggest = z;
		}
	}System.out.println("The largest number is "+biggest);
}}}
