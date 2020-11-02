package com.syntax.class12;

public class Q8printODDNum2Darray {

	public static void main(String[] args) {
		
		int [] [] numbers= {
				
				{1,2,3,4},
			    {5,6,7,8},
		    	{9,10,11,12}
		                         };  //print sum of odd numbers too
		int sum=0;
		for(int[] nums:numbers) {
			for (int num:nums) {
				if(num%2!=0) {
					sum+=num;
				}
			}

		}
		System.out.println("sum of all odd numbers "+sum);
		
		System.out.println("----------Second way------------");
		
		int sum1=0;
		
		for (int i=0; i<numbers.length; i++) {   //iterating over rows
			for (int j=0; j<numbers[i].length; j++) { //iterating over columns
				
				if((numbers[i][j]%2)!=0) {  //checking condition for odd numbers only  or%2==1
	
				sum1=sum1+numbers[i][j];	
				}
			}

		}
		System.out.println("sum of all odd numbers "+sum1);

	}

}
