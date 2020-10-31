package com.syntax.class10;

public class HW3CountrAndCapitals {

	public static void main(String[] args) {
		// only if the same order(sequence) of countr. and cap., otherwise poidet ne tak -))
		
		String[] countries= {"USA","Ukraine","Canada"};
		String[] capitals= {"DC","Kiev","Ottawa"}; 
		
		for(int v=0; v<countries.length; v++) {
			System.out.println("The capital of "+countries[v]+" is "+capitals[v]);
		}
		
		

	}

}
