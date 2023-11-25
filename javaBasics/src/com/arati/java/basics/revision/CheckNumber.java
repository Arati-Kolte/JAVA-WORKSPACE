/**
 * 
 */
package com.arati.java.basics.revision;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class CheckNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int number = scanner.nextInt();
		
		if (number > 20 ) {
			System.out.println("Number " + number +" is greater then 20");
		}
		
		if (20 < number) {
			System.out.println("20 is less than number " + number);
		}
		
		if (number < 100) {
			System.out.println("Number " + number +" is less then 100");
		}
		
		if (100 > number) {
			System.out.println("100 is greater than number "+ number);
		}
		
		
		scanner.close();
	}

}
