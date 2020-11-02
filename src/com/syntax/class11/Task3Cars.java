package com.syntax.class11;

public class Task3Cars {

	public static void main(String[] args) {
		
		String[][] cars= {
				
				// 0      // 1   // 2
				{"Jeep","Ford","Dodge"},              // 0  American cars  //carArray 1
				{"Audi","Porsche","BMW"},             // 1  German cars    //carArray 2
				{"Kia","Hyundai","Hyundai Sonata"},   // 2  Korean cars    //carArray 3 
				{"Ferrari","Maserati","Lamborghini"}, // 3  Italian cars   //carArray 4
				
		};
		
       // FOR EACH LOOP
		
		for(String [] carArray:cars) {
			
			for(String car:carArray) {
				System.out.println(car+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println("-----------------standard print array-------------------------");
		
		for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				System.out.print(car+" ");
			}
			System.out.println();
		}
		
		
	}

}
