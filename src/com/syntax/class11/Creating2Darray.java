package com.syntax.class11;

public class Creating2Darray {

	public static void main(String[] args) {
		
		//ENHANCED FOR LOOP
		
		String[][] food= {
				
				{"steak","hot dog","burger"},
				{"pizza","pasta","canoli"},
				{"sushi","ramen","fried rice","dumplings"},
				{"kebab","manto"},
				{"beriyani","masal","curry","tikka masala"},
				
		};
		
		for(String[] dishes:food) {
			
			for(String dish:dishes){
				System.out.print(dish+" ");	
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		
		//regular loop, same output
		
		for(int i=0; i<food.length; i++) {
			for(int j=0; j<food[i].length; j++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
