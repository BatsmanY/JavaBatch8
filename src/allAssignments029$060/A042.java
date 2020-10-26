package allAssignments029$060;
import java.util.Scanner;

public class A042 {

	public static void main(String[] args) {
		//First Output: "enter the roll number of the Child"

// case 101: if roll number is 101 print as "Student name: Ramesh "

// case 102 :if roll number is 102 print as "Student name: Mahesh "

// case 103:if roll number is 103 print as "Student name: Mukesh "

// Other than this roll number  it should print "Not found Student name: in Class"

		String print;
		int num;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		num=scan.nextInt();
		
		switch(num) {
		case 101:
			print="Student name: Ramesh ";
			break;
		case 102:
			print="Student name: Mahesh ";
			break;
		case 103:
			print="Student name: Mukesh ";
			break;
			default:
				print="Not found Student name: in Class";
				
			
		}
		
		System.out.println(print);
		
		
		
	}

}
