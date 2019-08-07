package com.malex.perez;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		byte me;
		short man;
		int egrity;
		long schlong;
		float boat;
		double trouble;
		
		System.out.println("Enter a Byte Value:");		
		me = scan.nextByte();

		System.out.println("Enter a Short Value:");
		man = scan.nextShort();
		
		egrity = me + man;
		System.out.println(egrity);
		
		schlong  = man + egrity;
		System.out.println(schlong);
		
		boat = schlong + egrity;
		System.out.println(boat);
		
		trouble = boat + schlong;
		System.out.println(trouble);
		
	}
}
