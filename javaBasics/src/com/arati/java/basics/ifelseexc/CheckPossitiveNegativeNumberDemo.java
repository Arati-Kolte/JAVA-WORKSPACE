/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class CheckPossitiveNegativeNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		
		if (number >= 0) {
			System.out.println("Possitive number");
		}else {
			System.out.println("Negative number");
		}
			
		
		
		scanner.close();
		

	}

}
