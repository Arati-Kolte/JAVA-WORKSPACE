/**
 * 
 */
package com.arati.java.basics.forloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintTableForLoop1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		int i;
		for(i = 1; i <= 10; i++) {
			System.out.println(i*num);
		}
		scanner.close();
		

	}

}
