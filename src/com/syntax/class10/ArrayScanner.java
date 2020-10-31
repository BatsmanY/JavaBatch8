package com.syntax.class10;
import java.util.Scanner;
public class ArrayScanner {

	public static void main(String[] args) {
		
		//ask user how many names he would like to store
		
		Scanner scan;
		String[] names;
		int size;
		
		scan=new Scanner(System.in);
		System.out.println("how many names would U like to store");
		size=scan.nextInt();
		
        names=new String[size];
		
        
        //loop to store values into Array
		for(int i=0; i<size; i++) {
			System.out.println("enter any name");
			
			names [i]=scan.next();
		}

		//loop to retrieve values from array (!_retrieving = polu4it; izvlech)
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+" ");
		}
		
		
		
	}

}

















