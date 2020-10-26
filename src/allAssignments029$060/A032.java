package allAssignments029$060;

import java.util.Scanner;

public class A032 {

	public static void main(String[] args) {

		// "Please enter your gender: M or F" and their age "Please enter your age"
		// If age is above 25, then check if a user entered F then the output should be
		// "Woman" otherwise it should say "Man"
		// If age is below 25, then check if a user entered F then the output should be
		// "Girl"  otherwise it should say "Boy"

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender: M or F");
		String gender = scan.nextLine();

		System.out.println("Please enter your age");
		int age = scan.nextInt();
		
		if(age>25) {
			if(gender.equals("M")) {
				System.out.println("Man");
				
			}else {
				System.out.println("Woman");
			}
		}else {
			if(gender.equals("M")) {
				System.out.println("Boy");
				
			}else {
				System.out.println("Girl");
			}
		}
		
	
	}
}
