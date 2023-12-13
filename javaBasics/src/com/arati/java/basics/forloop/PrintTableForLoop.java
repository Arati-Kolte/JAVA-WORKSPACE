/**
 * 
 */
package com.arati.java.basics.forloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintTableForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		int a;
		for(a = 1;a<=10;a++) {
		System.out.println(a*num);
		}
		

	}

}
