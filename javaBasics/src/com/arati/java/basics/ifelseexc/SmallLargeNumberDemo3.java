/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class SmallLargeNumberDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		double number = scanner.nextDouble();
		
		if (number > 0) {
			if (number < 1) {
				System.out.println("Small possitive number");
			}
			else if (number > 1000000) {
				System.out.println("Large possitive number");
			}
			else {
				System.out.println("Possitive number");
			}
			
			
		}
		else if (number < 0) {
			if (Math.abs(number) < 1) {
				System.out.println("Small negative number");
			}
			else if(Math.abs(number) > 1000000) {
				System.out.println("Large negative number");
			}
			else {
				System.out.println("Negative number");
			}
			}
		else {
			System.out.println("Zero");
		}
		
		
		

	}

}
