/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintTableWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		int n = 1;
		while(n <= 10){
			System.out.println(n*num);
			
			n++;
			
		}
		scanner.close();
	}

}
