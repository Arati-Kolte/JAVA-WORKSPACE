/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class FindSmallestNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = scanner.nextDouble();
		
		System.out.println("Enter second number");
		num2 = scanner.nextDouble();
		
		System.out.println("Enter third number");
		num3 = scanner.nextDouble();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("The number (" + num1 + ") smallest");
		}else if (num2 < num1 && num2 < num3) {
			System.out.println("The number (" + num2 + ") smallest");
		}else {
			System.out.println("The number (" + num3 + ") smallest");
			
		}
		scanner.close();

	}

}
