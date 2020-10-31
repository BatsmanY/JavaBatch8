package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		// to access element from an array:
		System.out.println("Accessing 3rd element which is "+num[2]);
		
		System.out.println(num[1]+num[4]);
		
		
		
		//I would like to change 50 to 100 - reassign value of num [4]
		
		num[4]=100;  //simple reassignment of value
		 
		 System.out.println("Value of 5th element after change "+num[4]);
		
		
		String[] array=new String[4];
		array[0]="Hello";
		array[1]="Hi";
		array[2]="Bye";
		array[3]="Yay";
		
		System.out.println("Accessing second element "+array[1]);
		System.out.println(array[1]+" "+array[2]);
		
		
		
		
		
		
		
		
	}

}
