package allAssignments029$060;
import java.util.Scanner;
public class A037 {

	public static void main(String[] args) {
	String drink;
	    Scanner input=new Scanner(System.in);
	    System.out.println("Are you thirsty? true or false");
	    boolean areYouThirsty=input.nextBoolean();
	    
	    System.out.println("Are you sleepy? true or false");
	    boolean areYouSleepy=input.nextBoolean();
	    
	    /*If user is thirsty and not sleepy--> drink=Water
	     * If user is thirsty and sleepy--> drink=Coffee
	     * If user is not thirsty and sleepy --> drink=Tea
	     * Otherwise drink="Nothing"
	     * FINAL OUTPUT: Looks like you need to drink ___
	     */

    if(areYouThirsty&&(!areYouSleepy)) {
    	drink="Water";
    
    }else if(areYouThirsty&&areYouSleepy) {
    	drink="Coffee";
    }else if(!areYouThirsty&&areYouSleepy) {
    	drink="Tea";
    }else {
    	drink="Nothing";
    }
	   System.out.println("Looks like you need to drink "+drink); 
	    
	    
	    
	    
		
		
		
	}

}
