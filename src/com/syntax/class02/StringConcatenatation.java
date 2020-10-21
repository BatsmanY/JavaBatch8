package com.syntax.class02;

public class StringConcatenatation {

	public static void main(String[] args) {
		
		
		String name="Olga";
		
		//I would like to say: My name is Olga
		
		System.out.println("My name is "+name);
		String lastName=" Sorrels";
		
		//I would like to print Olga Sorrels
		
		System.out.println(name+lastName);
		
		String city="Miami";
		// Olga lives in Miami
		
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//Olga is B student
		
		System.out.println(name+" is"+" "+grade+" student");
		
		String state="DC";
		String anotherState="    DC ";
		
		//above string are not equal
		//different amount of characters in each string here
		System.out.println(state);
		System.out.println(anotherState);
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
