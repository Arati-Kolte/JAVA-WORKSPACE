/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintNumbersUsingWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();

		int i = 0;

		while (i <= num) {
			System.out.print(i + " ");

			i++;
		}
		
		System.out.println();

		while (num >= 0) {
			System.out.print(num + " ");

			num--;
		}
		scanner.close();
	}

}
