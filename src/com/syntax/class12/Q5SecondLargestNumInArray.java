package com.syntax.class12;
import java.util.Arrays;
public class Q5SecondLargestNumInArray {

	public static void main(String[] args) {
		//find Second Largest Number In the Array

		          // 0  1   2  3  4  5  6
		int[] num= {7, 15, 10, 15, 1, 0,-12};
		int length=num.length;
		
		Arrays.sort(num); //{1,3,5,6,10}  - "sorting" in order from smallest to largest  !!->>  will not work properly if max=second max
		
		System.out.println("second largest number is "+num[length-2]); // num1[length-2] will print second from the end(end is largest)
		
		
		System.out.println("--------------Second way - no sort.util tool----------------------------");
		
		// Second way - no sort.util tool
		
		int max=num[0];
		int secondmax=0;  // to avoid   following !!->>  will not work properly if max=second max
		
		for(int i=0; i<length; i++) {
			if(num[i]>max) {
				secondmax=max;
				max=num[i];
			}else if(num[i]>secondmax && num[i]!=max) {
				secondmax=num[i];
			}
			
		}
		
		System.out.println("second largest number is "+secondmax);
		System.out.println("largest number is "+max);
		
		
		
	}

}
