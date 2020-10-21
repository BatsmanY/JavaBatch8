package allAssignmentsFrom029;
import java.util.Scanner;
public class A034 {

	public static void main(String[] args) {
		/*Write a program to find the largest number among three distinct numbers using nested if condition
		 * OUTPUT below:
		 * Please enter 3 distinct numbers 4 5  and 14
         *The largest number is 14
		 */
		
		Scanner scanner=new Scanner(System.in);
		int x, y, z;
		int biggest;
		
		System.out.println("Please enter 3 distinct numbers");
		
		x=scanner.nextInt();
		y=scanner.nextInt();
		z=scanner.nextInt();
		
		scanner.close();
		
		if(x==y && y==z) {
			System.out.println("Numbers are equal");
		}else {
		
		if(x>y){ 
			if (x > z) {
				biggest = x;
			} else {
				biggest = z;
			}
		}else{ 

			if (y > z) {
				biggest = y;
			} else {
				biggest = z;
			}
		}System.out.println("The largest number is "+biggest);
	}	
		
	}

}
