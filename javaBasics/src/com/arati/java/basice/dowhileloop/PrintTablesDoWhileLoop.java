/**
 * 
 */
package com.arati.java.basice.dowhileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintTablesDoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		int i = 1;
		do {
			System.out.println(i * num);
			i++;
			 
		}while(i<=10);
			

	}

}
