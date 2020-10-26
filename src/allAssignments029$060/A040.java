package allAssignments029$060;
import java.util.Scanner;
public class A040 {

	public static void main(String[] args) {
		// First Output: "Enter name of the instructor"
		/*if User provided the name as Asghar as input
		 *  it should show  "Will take care of Java Assignment"
		 */
		
		System.out.println("Enter name of the instructor");
		Scanner scan;
		String name, message;
		
		scan=new Scanner(System.in);
		name=scan.nextLine();
		
		switch(name) {
		case "Asghar":
			message="Will take care of Java Assignment";
			break;
		case "Moazam":
			message="Will take care of SDLC Assignment";
			break;
		case "Weqas":
			message="Will take care of Selenium Assignment";
			break;
		case "Asel":
			message="Will take care of every Assignment";
			break;
			default:
				message="Invalid instructor selected";
				
			
		}
		System.out.println(message);
		
		
		

	}

}
