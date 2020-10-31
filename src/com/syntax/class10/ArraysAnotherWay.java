package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		// BEST WAY, SHORT WAY
		
		
		String[] names={"Mike", "Alex", "Jack", "Danilo", "Brian"};
		
		System.out.println(names[3]);
		
		
		//To find out how many elements in array
		
		int size=names.length;
		System.out.println("Size of names array = "+size);
		
		
		System.out.println(names[names.length-2]); //names[5-2] ->> names[3] ->> Danilo
		
		int i=2;
		System.out.println(names[i]); //Jack
		
		i+=2;
		System.out.println(names[i]); //Brian
		System.out.println("-----------------------------------------------------------");
		
		for(int a=0; a<names.length; a++) {
		
			System.out.println(names[a]);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for(int a=0; a<=names.length; a++) {  //ERROR: ArrayIndexOutOfBoundsException: 
			        //to keep      a<=names.length --> simply minus '1' from that                     
			
			System.out.println(names[a]);   // !_ Index 5 out of bounds for length 5 -- i don't have names[6]!
		
	}}

}
