/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class OddNumbersUsingWhile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scanner.nextInt();
		
		int i = 11;
		System.out.print("Odd numbers till : ");
		
		while( i <= num) {
			if(i % 2 != 0) {
				System.out.print(i + " , ");
			}
			i++;
		}
		    scanner.close();

	}

}
