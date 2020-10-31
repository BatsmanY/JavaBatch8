package com.syntax.class10;

public class ArraysIntroLongWay {

	public static void main(String[] args) {
		
		//LONG WAY - SIMPLIEST BUT NOT THE BEST METHOD
		
		//Calculate average score for 5 students
		
		int[] grades=new int[5];
		
		        grades[0]=98;
				grades[1]=80;
				grades[2]=89;
				grades[3]=67;
				grades[4]=77;
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		
		System.out.println("Average score of 5 students ="+average);
		
		
		int a=10;
		int b;
		b=10;
		
		double[] array;
		
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		
		System.out.println("Value of last element "+array[2]); // 0.00 - default automatically
		 
		//now add array [2] ->>
		
	//->
		array[2]=5.99;
		
		System.out.println("Value of last element "+array[2]); //5.99
		
		//now add array [3]=5.00;
		// ->> ERROR because i said to store only 3 elements in beginning
		// ArrayIndexOutOfBoundsException - error name
		
		System.out.println("----------------NEW EXAMPLE---------------------");
		
		String[] liquid=new String[4]; //arrays are fixed in size!!!
		liquid[2]="Water";
		liquid[1]="Tea";
		
		System.out.println(liquid[0]); //'null' - output because array is fixed in size
		
		
		
		
		
		
	}

}
