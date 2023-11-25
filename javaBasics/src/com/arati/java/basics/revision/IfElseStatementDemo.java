/**
 * 
 */
package com.arati.java.basics.revision;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class IfElseStatementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		
		if (number >= 450 && number <=675) {
			System.out.println("Valid number");
		}else {
			System.out.println("Number is out of range, it should be 450 to 675");
		}
		
		
		
		scanner.close();

	}

}
