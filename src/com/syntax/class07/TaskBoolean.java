package com.syntax.class07;

public class TaskBoolean {

	public static void main(String[] args) {
		/*As long as its workDay print "I need a day off" 
		 * and increase a day
		 * Once day hits 6, print "I don't need a day off"
		 */
		
		boolean workDay=true;
		int day=1;
		
	  while(workDay) {
		  if(day<6) {
		  System.out.println("I need a day off");
		  }else {
			
			System.out.println("It is weekend and I am off");
			break; //here to stop the Loop
			
		// or   workDay=false; //to stop infinite loop
	}
		  
	day++;	  //and increase a day
		  
	}}

}