package AllAssignments063$080;
import java.util.Scanner;
public class A064 {

	public static void main(String[] args) {
		//Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of end
		//(value must be taken from a user), exclusive.
		
		Scanner inp;
	    int end;
	    System.out.print("Int:");
	    //write your code below
	    
	    inp=new Scanner(System.in);
	    
		end=inp.nextInt();
		
		for(int a=0; a<(2*end); a++ ) {
			System.out.print(a+" ");
		}
		
		
		
		
		
		

	}

}
