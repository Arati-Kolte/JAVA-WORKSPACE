/**
 * 
 */
package com.arati.java.basics.exercise;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
//created a class to read double value from console.
public class ReadPrintDoubleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declared a variable num and inisilized  with value 0.0
		double num = 0.0;
		
		Object system;
		//creating a scanner class object
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		//This line will read double and assign it to num
		num = scr.nextDouble();
		
		System.out.println("Given input num is : " + num);
		
				
				

	}

}
