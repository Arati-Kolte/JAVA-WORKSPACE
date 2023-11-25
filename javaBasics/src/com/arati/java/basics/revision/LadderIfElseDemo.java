/**
 * 
 */
package com.arati.java.basics.revision;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class LadderIfElseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter robin's age :");
		int age = scanner.nextInt();
		
		
		if(age <= 0) {
			System.out.println("Invalid age is provided");
		}else {
			if (age > 0 && age <= 15) {
				System.out.println("Robin is teenager boy");
			}else if (age > 15 && age <= 30) {
				System.out.println("Robin is young boy");
			}else if (age > 30 && age <= 60) {
				System.out.println("Robin is matured man");
			}else {
				System.out.println("Robin is old man");
			}
		}
		
		System.out.println("");
		
		System.out.println("Another way-----");
		
		System.out.println("");
		
		//Another way
		
		if(age > 0) {
			if (age > 0 && age <= 15) {
				System.out.println("Robin is teenager boy");
			}else if (age > 15 && age <= 30) {
				System.out.println("Robin is young boy");
			}else if (age > 30 && age <= 60) {
				System.out.println("Robin is matured man");
			}else {
				System.out.println("Robin is old man");
			}
		}else {
			System.out.println("Invalid age is provided");
		}
		
		scanner.close();

	}

}
