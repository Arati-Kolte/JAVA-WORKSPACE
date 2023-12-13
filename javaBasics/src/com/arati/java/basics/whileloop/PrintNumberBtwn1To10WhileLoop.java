/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintNumberBtwn1To10WhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scanner.nextInt();
		
		while(num < 1 || num > 10) {
			System.out.println(num + "is not between 1 and 10,Try again");
			num = scanner.nextInt();
		}
		System.out.println(num + " is between 1 and 10");
		

	}
	

}
