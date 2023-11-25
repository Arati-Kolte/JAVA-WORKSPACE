
/**
 * 
 */
package com.arati.java.basics.exercise;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
//This class will be used to read an integer value from console and print it on console.
public class ReadPrintIntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declared a variable type of integer and initialized it with zero
		int number = 4;
		
		//Created object of Scanner class to read input from console 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		//Below line will read an integer from console and assign it to number
		number = scanner.nextInt();
		
		System.out.println("Provided input number is : " + number);
		
		
		

	}

}
