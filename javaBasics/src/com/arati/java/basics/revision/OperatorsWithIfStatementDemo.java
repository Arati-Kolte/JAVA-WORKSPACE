/**
 * 
 */
package com.arati.java.basics.revision;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class OperatorsWithIfStatementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an robins age :");
		int age = scanner.nextInt();
		
		if(age <= 0) {
			System.out.println("Invalid age is provided");
		}else {
			if (age <= 15 && age > 0) {
				System.out.println("Robin is teenager boy");
			}
			
			if (age >= 16 && age <= 30) {
				System.out.println("Robin is young boy");
			}
			
			if (age >30 && age <= 60) {
				System.out.println("Robin is matured man");
			}
			
			if (age > 60) {
				System.out.println("Robin is old man");
			}
		}	
		scanner.close();
	}

}
