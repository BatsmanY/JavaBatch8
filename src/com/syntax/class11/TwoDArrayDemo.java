package com.syntax.class11;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		//3 rows and 4 columns
		//=new char [#rows][#columns]
		
		char[] [] $array=new char[3][4];
		
		// add values to the 1st row

		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		// 2nd row:
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		
		// 3d row:
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='E';
		$array[2][3]='R';
				
				System.out.println($array[1][3]); //to print Z
				
				System.out.println("--------------another way to create 2D array----------------");
				
		int [][] array= {
				
				//0  1  2
				{10,20,30},      //0
				{1, 2, 3 },      //1
			   {100,200,300}     //2
	                            	};
		
		System.out.println(array[2][1]); //200
		System.out.println(array[0][0]); //10
		
		System.out.println(array.length); // how many single arrays I have inside of 2D
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
