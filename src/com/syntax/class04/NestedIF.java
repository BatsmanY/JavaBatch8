package com.syntax.class04;

public class NestedIF {

	public static void main(String[] args) {
		/*
		 * variable for allergy -yes or no
		 * 
		 * if allergy is yes -->
		 *                  we will check if pet allergy
		 *                                if paunut allergy
		 *                                if pollen allergy
		 *if no allergy you are lucky !!!    
		 */
		
		boolean allergy=true;
		
		boolean peanutAllergy=true;
		boolean petAllergy=true;
		boolean pollenAllergy=false;
		
		if(allergy) {//boolean expression ->>can use as the condition (dont have to be allergy==true)
			
			System.out.println("Lets do farther check");
			if(petAllergy) {                                      //INNER IF
				System.out.println("please no pets in the house");
			
		}else {
			System.out.println("You are lucky");}
		
	}System.out.println("--------------------example2--------------------");
	
	/*
	 * if todays is Friday we will watch movie but would like to check the date
	 * 
	 *                 if date is 13 --> watching scary movie
	 *                 and if it is not --> I will watch comedy, action
	 *                 
	 * if no Friday --> I am studying
	 */
		boolean isFriday=true;
		int date=13;
		boolean monday=true;
		
		
		if(isFriday) {
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch PK movie with Amir");
			}
			
			
		}else {
			if(monday) {
				System.out.println("I am not studying, I am working");
			}else {
			System.out.println("I have class at Syntax");
			
		}
		
		}
		System.out.println("--------------------example3--------------------");
		
		/*check if assignment is completed
		 * if assignment is completed :
		 *              if score>90 --> great job
		 *              if score>80 --> good job      
		 *              if score>70 --> study more
		 */
		
		int score=60;
		boolean assignment=false;
		
		if(assignment) {
			//I'll check your score
			
			if(score>90) {
				System.out.println("you did great!!!");
			}else if(score>80) {
				System.out.println("you did good");
			}else if(score>70) {
				System.out.println("study more");
			}else 
				System.out.println("must study more, thanks for trying");
	
			
		}else {
			System.out.println("You should always complete all assignments");
		}
		
}
	}


















