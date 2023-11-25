/**
 * 
 */
package com.arati.java.basics.exercise;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
//Created a class to read string value from console
public class ReadPrintStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declaired a variable type string and intialized with " "
		
		String str = "";
		
		//created object of scanner class to read input from console
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Enter a name :");
		
		//below line will read string from console and assign it to str
		str = scanner.toString();
		
		System.out.println("Provided input name is : " + str);
		
		
		
		
		
		

	}

}
