/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class EvenNumbersUsingWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int range = scanner.nextInt();
		
		scanner.close();
		
		int count = 2;
		
		System.out.println("List of all even numbers from 1 to " + range +":");
		while(count <= range) {
			if(count % 2 == 0) {
				System.out.print(count + " , ");
			}
			count++;
		}
	}

}
