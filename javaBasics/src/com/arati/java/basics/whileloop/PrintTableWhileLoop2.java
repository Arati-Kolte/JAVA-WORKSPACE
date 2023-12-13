/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintTableWhileLoop2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i*num);
			i++;
		}
		scanner.close();
		

	}

}
