/**
 * 
 */
package com.arati.java.basics.whileloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class EvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scanner.nextInt();
		
		int n = 2;
		System.out.println("Even numbers :" +num);
		while(n <= num ) { 
			if( n % 2 == 0){
				System.out.println(n + " ' ");
			}
		 n++;
		
		}
		
	}

}
