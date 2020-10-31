package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		//array of animals, 6 elements
		//using 2 different loops - print all elements
      
		String[] pets = {"cat", "dog","tiger","pig", "monkey","fox"};

		// 1 loop
		for(int i=0; i<pets.length; i++) {
			System.out.println(pets[i]+" ");
		}
		System.out.println();
		//2 loop
		
		for(String pet:pets) {
			System.out.println(pet+" ");
		}
		
		
		
		
	}

}
