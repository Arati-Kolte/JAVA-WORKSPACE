/**
 * 
 */
package com.arati.java.basics.revision;

//need to import scanner class from java.util package
import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class ReadInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//to get input from user need to create object of scanner class
		//creating a object of scanner class
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name = scr.next();
		
		System.out.println("Enter age :");
		int age = scr.nextInt();
		
		System.out.println("Enter gender :");
		char gender = scr.next().charAt(0);
		
		System.out.println("Enter mobile number :");
		long mobileno = scr.nextLong();
		
		
		
		
		

	}

}
