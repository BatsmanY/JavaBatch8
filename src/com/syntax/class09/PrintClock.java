package com.syntax.class09;

public class PrintClock {

	public static void main(String[] args) {
		// international clock 24 hours and 60 minutes
		// 00:01  00:02  00:03...00:59 - loop for minutes  -> !_INNER loop
		// 1:01   1:02 ... 1:59 - loop for hours -> !_OUTER loop
		
		for(int h=0; h<=23; h++) {
			for (int m=0; m<=59; m++) {
				
				
				if(m<10) {System.out.println(h+":0"+m);
					
				}else { System.out.println(h+":"+m);
					}
					
					}}
			}
	}

