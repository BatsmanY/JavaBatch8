package allAssignments029$060;
import java.util.Scanner;
public class A043 {

	public static void main(String[] args) {
		
		// THIS IS A044
		
		String make, carOrigin;
		Scanner scanner;
		
		scanner=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		make=scanner.nextLine();
		
		switch(make) {
		case "BMW":
			carOrigin="german car";
			break;
		case "Toyota":
			carOrigin="japanese car";
			break;
		case "Maserati":
			carOrigin="italian car";
			break;
		default:
			 carOrigin ="unknown";
			
		}
		
		
		System.out.println(carOrigin);
		
		
		
	}

}
