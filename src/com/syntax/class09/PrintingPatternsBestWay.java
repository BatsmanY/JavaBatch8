package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		
		for(int r=1; r<=4; r++) {                 //  4 ROWS ****
			for(int c=1; c<=6; c++) {            //  6 COLUMNS of *
				System.out.print("*");           // print - not println !! 
			}
			System.out.println();
		}
		
		System.out.println("_______________________ BIG SQUARE________________________");
		// 6 rows and 12 columns of ******  
		
		for(int a=1; a<=6; a++) {
			for(int b=1; b<=12; b++) {
				System.out.print("*"); // or $$$$$ any symbol
			}
			System.out.println();
		}
		
		
		
	}

}
