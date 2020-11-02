package com.syntax.class12;
import java.util.Arrays;
public class Q4MaxMinInArray {

	public static void main(String[] args) {
		
		//find maximum and minimum number in array
		
		int[] myArray= {66,45,65,32,-15,0,20,300,1000};
		
		int max=myArray[0]; //assign first element to MAX
		int min = myArray[0]; //assign first element to MiN
		
		
		for(int i=1; i<myArray.length;i++) {
			if(myArray[i] > max) {
				max=myArray[i];
			}
			if(myArray[i] < min) {
				min=myArray[i];
			}
		}
		
		System.out.println("the largest number in array is "+max);
		System.out.println("the smallest number in array is "+min);
		
		
		
		
		
		
		System.out.println("--------------------------------------------");
		
		// Second way - with sort.util tool
		// MUST ADD import java.util.Arrays;
		
		
		Arrays.sort(myArray); //to sort in order from smallest to largest number
		
		System.out.println("Minimum number= "+myArray[0]);                //min=first element, index 0
		System.out.println("Maximum number= "+myArray[myArray.length-1]); //max=last element; index (total length -1)
		
		

	}

}
