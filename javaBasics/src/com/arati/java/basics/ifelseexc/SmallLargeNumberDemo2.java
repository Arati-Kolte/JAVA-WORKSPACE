/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class SmallLargeNumberDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number :");
		double number = scanner.nextDouble();
		
		if (number > 0) 
		 {
			System.out.println("possitive number");
			}
			
		else if(number < 0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("Zero");
		}
		

	}

}
