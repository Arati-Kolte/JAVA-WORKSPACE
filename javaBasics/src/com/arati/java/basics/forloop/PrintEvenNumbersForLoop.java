/**
 * 
 */
package com.arati.java.basics.forloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintEvenNumbersForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		
		//even numbers
		int i;
		for(i = 2;i <= num ;i++) {
			if(i%2==0)
			System.out.print(i + " , ");
		}
		
		System.out.println("");
		System.out.println("");
		//odd numbers
		int n;
		for(n = 1; n <= num; n++) {
			if(n%2!= 0)
			System.out.print(n + ", ");
		}
	}

}
