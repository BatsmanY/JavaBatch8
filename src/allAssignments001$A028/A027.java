package allAssignments001$A028;
import java.util.Scanner;

public class A027 {

	public static void main(String[] args) {
		
		//Please enter your age 18
		//You are eligible to vote
		//Please enter your age 16
		//You are not eligible to vote
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else{
			System.out.println("You are not eligible to vote");
		}
		
		
		
		
		
		

	}

}
