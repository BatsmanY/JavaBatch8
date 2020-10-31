package com.syntax.class09;

public class PrintPatMore {

	public static void main(String[] args) {
		//12345
		//12345
		//12345
		//12345
		
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("--------------12345678------------------- (7 rows=times)---------------");
		
		for (int a=1; a<=7; a++) {  //ROWS
			for(int b=1; b<=8; b++) {  //COLUMNS
				System.out.print(b); //SWITCH to (a) to get 1111111 //2222222// 3333333 etc v stolbik
			}
			System.out.println();
		}
System.out.println("=========================================================");
/* 777777
 * 666666
 * 555555
 * 444444
 * 333333
 * 222222
 * 111111
 */

for(int a=7; a>=1; a--) {  //ROWS
	for (int b=6; b>=1; b--) {  //COLUMNS
		System.out.print(a);
	} 
	System.out.println();
}
/* 7654321
 * 7654321
 * 7654321
 * 7654321
 * 7654321
 */
System.out.println("==============7654321 (5 rows)====================");
   for (int a=5; a>=1;a--) { 
	   for(int b=7; b>=1; b--) {
		   System.out.print(b);
	   }
	   System.out.println();
   }









	}

}
