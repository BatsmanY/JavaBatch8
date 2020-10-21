package allAssignmentsFrom029;
import java.util.Scanner;
public class A035 {

	public static void main(String[] args) {
		/*"Do you need a loan?"
		 *If is true then question:"What is your credit score?". Otherwise eligibility is "Unknown"
		 *Based on the score define users eligibility:
		 *if score is below  600 --> eligibility = "Not eligible"
		 *if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
		 *if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
		 *if score is higher than any other previous values --> eligibility = "Definitely eligible" .  
		 *
		 *OUTPUT: The eligibility is ____
		 */

		Scanner userIn = new Scanner(System.in);

		boolean loan;
		String eligibility = null;
		double score;

		System.out.println("Do you need a loan?");

		loan = userIn.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			score = userIn.nextDouble();

			if (score < 600) {
				eligibility = "Not eligible";

			} else if (score > 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score > 701 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}

		} else {
			eligibility= "Unknown";
		}

		System.out.println("The eligibility is " + eligibility);

		
		
	}

}
