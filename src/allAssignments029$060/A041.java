package allAssignments029$060;
import java.util.Scanner;
public class A041 {

	public static void main(String[] args) {
		//First Output: "enter the age of the Child"

//case 1: if age is 1 print as "You can Crawl"

///case 2 : if age is 2 print as  "You can Talk"

//case 3: If age is 3 print as "You can Dance"

//case 4: if age is 4 print as "You can get  Trouble"

//Other than this age (1-4) it should print "I don't know how old you are" 		
		int age;
		String message;
		
		System.out.println("enter the age of the Child");
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		
		switch(age) {
		case 1:
			message="You can Crawl";
			break;
		case 2:
			message="You can Talk";
			break;
		case 3:
			message="You can Dance";
			break;
		case 4:
			message="You can get  Trouble";
			break;
			default:
				message="I don't know how old you are";
			
		}
		System.out.println(message);
		

	}

}
