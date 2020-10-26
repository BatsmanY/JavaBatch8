package allAssignments029$060;
import java.util.Scanner;
public class A039 {

	public static void main(String[] args) {
		// A school has following rules for grading system:
		// a. 1 to 25 - F
		// b. 25 to 45 - E
	 	// c. 45 to 50 - D
	   //d. 50 to 60 - C
		//  e. 60 to 80 - B
	   //	f. Above 80 - A
	 //	Ask the user to enter marks and print the corresponding grade. 

   /*FINAL OUTPUT:
   *Please enter your mark
   *Your grade is A
   *
   * OR
   *Please enter your mark
   * Please enter valid mark
   */
		 Scanner scan;
			int mark;
			char grade = 0;

			scan = new Scanner(System.in);
			System.out.println("Please enter your mark");
			mark = scan.nextInt();
			if (mark > 0 && mark < 25) {
				grade = 'F';
			} else if (mark >= 25 && mark < 45) {
				grade = 'E';
			} else if (mark >= 45 && mark < 50) {
				grade = 'D';
			} else if (mark >= 50 && mark < 60) {
				grade = 'C';
			} else if (mark >= 60 && mark < 80) {
				grade = 'B';
			} else if (mark >= 80 && mark <= 100) {
				grade = 'A';
			} else {
				System.out.println("Please enter valid mark");
			}
			if (grade!=0){
			  System.out.println("Your grade is "+grade);
			}
		
	}

}
