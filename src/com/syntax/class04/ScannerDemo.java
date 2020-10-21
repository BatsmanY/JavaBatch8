package com.syntax.class04;

import java.util.Scanner;          //shortcut to import Ctrl+shift+o


public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);  //ENABLE INPUT TO THE CONSOLE
		//im adding some message to the user
		System.out.println("please enter any text");
		
		String value=scan.nextLine(); //waiting for input from me + ENTER
		System.out.println("I captured value ="+value);
		
		System.out.println("please enter your name");
		String name=scan.nextLine();
		System.out.println("nice to meet you "+name);
		
		
		

	}

}
