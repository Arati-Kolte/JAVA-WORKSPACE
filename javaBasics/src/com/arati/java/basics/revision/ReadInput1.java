/**
 * 
 */
package com.arati.java.basics.revision;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class ReadInput1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//need to create scanner class
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name = s.next();
		
		System.out.println("Enter age :");
	    int age = s.nextInt();
	    
	    System.out.println("Enter gender :");
		char gender = s.next().charAt(0);
		
		System.out.println("Enter mobile no :");
	    long mobileno = s.nextLong();
		
		
		

	}

}
