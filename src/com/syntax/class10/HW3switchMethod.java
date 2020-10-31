package com.syntax.class10;

public class HW3switchMethod {

	public static void main(String[] args) {
		//COUNTRIES & CAPITALS through switch method and using 2 different loops
		
		String[] countries= { "USA", "Italy", "France", "Greece", "Turkey", "Bulgaria"};
		
		
		String capital[] = new String[6];
		for (int i = 0; i < countries.length; i++)
		{
		switch (countries[i]) {
		case  "USA" :
			capital[i]= "Washington";
		break;
		case  "Italy" :
			capital[i]= "Rome";
		break;
		case  "France" :
			capital[i]= "Paris";
		break;
		case  "Greece" :
			capital[i]= "Athens";
		break;
		case  "Turkey" :
			capital[i]= "Ankara";
		break;
		case  "Bulgaria" :
			capital[i]= "Sofia";
		break;
		
		  }
		}
		System.out.println("\n---------------PRINTING WITH FOR --------------------------------------------------");
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i]+ " ");
		}
		System.out.println("\n---------------PRINTING WITH FOREACH -----------------------------------------------");
		
		for(String printCapital: capital) {
			System.out.print(printCapital+ " ");
	}

}}
