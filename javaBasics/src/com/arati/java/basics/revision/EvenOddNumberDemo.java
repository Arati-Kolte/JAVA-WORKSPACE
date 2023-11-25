/**
 * 
 */
package com.arati.java.basics.revision;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class EvenOddNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		
		if((number % 2) == 0) {
			System.out.println("Given number " + number + " even");
		}else {
			System.out.println("Given number " + number + " odd");
		}
		
		if((number % 2) == 0)
			System.out.println("Given number " + number + " even");
		else
			System.out.println("Given number " + number + " odd");
		
		scanner.close();

	}

}
