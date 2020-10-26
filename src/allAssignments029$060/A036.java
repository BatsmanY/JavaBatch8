package allAssignments029$060;
import java.util.Scanner;
public class A036 {

	public static void main(String[] args) {
		/* user to input two strings : "Please enter two strings"
		 * and two integers: "Please enter two numbers"  
		 * and make the comparisons:
		 * if int1 and int2 are equal and word1 and word2 are equal, output "AND"
		 * if int1 and int2 are equal or word1 and word2 are equal, output "OR"
		 * if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
		 */
       
        Scanner input=new Scanner(System.in);
		System.out.println("Please enter two strings");
		
		String word1=input.nextLine();
		String word2=input.nextLine();
		
		System.out.println("Please enter two numbers");
		
	     int x=input.nextInt();
	     int y=input.nextInt();
		
	     if((x==y) && (word1==word2)) {
	    	 System.out.println("AND");
	     }else if((x==y) || (word1==word2)) {
	    	 System.out.println("OR");
	     }else if(x!=y && word1!=word2) {
	    	 System.out.println("NONE");
	     }
	     
		
	}

}
