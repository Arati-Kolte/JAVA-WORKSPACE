/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class ReadFloatCheckDecimal1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number1");
		double number1 = scanner.nextDouble();
		System.out.println("Enter a number2");
		double number2 = scanner.nextDouble();
		
		if (number1 == number2) {
			System.out.println("They are same up to three decimal places");
		}
		else {
			System.out.println("They are diferent");
		}
		
		

	}

}
