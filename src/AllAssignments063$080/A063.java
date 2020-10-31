package AllAssignments063$080;
import java.util.Scanner;
public class A063 {

	public static void main(String[] args) {
		
		//for loop will print out series of numbers starting at 0 and ending at the x (value must be taken from a user), exclusive.

	     //stro4ka! for example: 
	     // In: 8
	    // 0 1 2 3 4 5 6 7
		
		Scanner inp;
	     int x;
	     System.out.print("In:");
	     
	     
	    inp=new Scanner(System.in);
	    x=inp.nextInt();
	    
		for(int x1=0; x1<x; x1++) {
			System.out.print(x1+" ");
		}
		
		
		
		
		
		
		

	}

}
