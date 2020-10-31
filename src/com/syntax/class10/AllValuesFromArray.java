package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
        String[] cars= {"bmw ","toyota ","honda ","mersedes ","audi ","vaz "};
		
		for(int a=0; a<cars.length; a++) {
			System.out.println(cars[a]+" ");
		}
		
		System.out.println("-----------------------getting STRING from array using enhanced for loop-------------------------------");
		//getting values from array using enhanced for loop

		for(String car: cars) {
			System.out.println(car+" ");
		}
		 System.out.println("===============getting INT from array using enhanced for loop=================");
		
		 
		 int[] numbers= {10,10,90,600,89};
		  
		 for(int num:numbers) {
			 System.out.println(num);
		 }
		 System.out.println("===============getting BOOLEAN from array using enhanced for loop=================");
		 
		 
		 boolean[] arrayOfBoolean= {true,true,false,true};
		 
		 for(boolean boo:arrayOfBoolean) {
			 System.out.println(boo);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
