package com.syntax.class11;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		//find largest number from this array
		
		int[] array= {10, 0, 20, 8, 100, 77, 56};
		int max=array[0];
		
		for (int i=1; i<array.length; i++) {
			
			if(array[i]>max) {
				max = array [i];
				
			}
			
		}
		
		
		System.out.println(max);
		

	}

}
