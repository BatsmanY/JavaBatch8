package com.syntax.class06;
import java.util.Scanner;
public class LargestNumberComparisong {
	
	// PLACING COMPARISONG IN IF PART

	Scanner scanner=new Scanner(System.in);
	double x, y, z, max;{
	
	x=scanner.nextDouble();
	y=scanner.nextDouble();
	z=scanner.nextDouble();
	
	scanner.close();
	
	if(x==y && y==z) {
		System.out.println("Numbers are equal");
		
	}else {
		if(x > y && x >z) {
			max=x;
		}else if(y>z) {
			max=y;
		}else {
			max=z;
		}
		System.out.println(max);
	}
}
	
}
