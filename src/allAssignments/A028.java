package allAssignments;
import java.util.Scanner;
public class A028 {

	public static void main(String[] args) {
		/*Write a program to take values of length and width from the user.
         *Based on value define whether the shape is a square or rectangle. 
		*/
		//Please enter the length 18
		//Please enter the width 16
		//The shape of your object is rectangle    //  (or square)
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the length");
		int l=input.nextInt();
		
		
		System.out.println("Please enter the width");
		int w=input.nextInt();
		
		
		if(l==w) {
			System.out.println("The shape of your object is square");
		}else {
			System.out.println("The shape of your object is rectangle");
		}
		
		
		
	}

}
