/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class FindSmallestAndLargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		LargestNumber largestNumber = new LargestNumber();
		SmallestNumber smallestNumber = new SmallestNumber();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = scanner.nextDouble();
		
		System.out.println("Enter second number");
		num2 = scanner.nextDouble();
		
		System.out.println("Enter third number");
		num3 = scanner.nextDouble();
		
		largestNumber.findLargestNumber(num1, num2, num3);
		
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		
		smallestNumber.findSmallestNumber(num1, num2, num3);
		
		scanner.close();

	}

}
