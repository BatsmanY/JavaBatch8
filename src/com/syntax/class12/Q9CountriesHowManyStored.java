package com.syntax.class12;

public class Q9CountriesHowManyStored {

	public static void main(String[] args) {
		// 2D array of countries
		//print all values using 2 different loops
		//calculate how many total countries been stored
		
		String[][] countries = {
				
				{"usa","canada", "mex",    "cuba"}, //4
				{"Braz","arg",   "colomb", "peru"}, //4
				{"ukr", "ital",   "france"},        //3
				{"jap", "indones","china",  "india"},//4
				{"nig", "ken",    "ethiop"}          //3     18 total
		};
		
		
		
		int total=0;
		for(int i=0; i<countries.length; i++) {
			
			total=total+countries[i].length;
			for(int j=0; j<countries[i].length; j++) {   //j<countries[i].length - how many elements inside each array 
				
				System.out.print(countries[i][j]+". ");  //countries[i][j] gives me one element1
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("total number of countries been stored is "+ total);
		
		
		
		
		
		System.out.println();
		System.out.println("---------------different loop-----------------");
		
		int sum=0;
		
		for(String [] c:countries) {
	   	
			//	sum=sum+c.length; <--  instead use the counter below sum++
			
			for(String name:c) {
				System.out.println(name+". ");
				sum++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("total number of countries been stored is "+sum);
		
		
		
	}

}
