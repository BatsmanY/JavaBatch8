package com.syntax.class07;
import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
		//ask user what is his name 5 times --> hello +name 

		Scanner scan;
		String name;
		int number=1;  //Initialize
		
		scan=new Scanner(System.in);
		
		while(number<=5) { //while condition is true
		
		System.out.println("Please tell me your name");
		name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		number++;
		}
		
	
	
	
		
	}

}
