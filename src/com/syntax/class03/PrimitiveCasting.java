package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//Process of casting in Java
		//casting=converting 1 value into another
		//widening = implicit
		//narrowing = explicit
		
		
		double d=15/7; //right way d=15.0/7.0 gives result 2.142...
		System.out.println(d);
		
		double e=9;  //widening 
		System.out.println(e);
		
		
		int i=(int)9.99; //narrowing
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
		
		
		
		
		
		
	}

}
