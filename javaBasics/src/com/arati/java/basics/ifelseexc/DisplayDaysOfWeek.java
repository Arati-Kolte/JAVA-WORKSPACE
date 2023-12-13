/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class DisplayDaysOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Enter a number :");
		int number = Scanner.nextInt();
		
		if(number > 0 && number <= 7) {
			if(number == 1) {
				System.out.println("Monday");
			}else if (number == 2) {
				System.out.println("Tuesday");
			}else if (number == 3) {
				System.out.println("Wednesday");
			}else if (number == 4) {
				System.out.println("Thursday");
			}else if (number == 5) {
				System.out.println("Friday");
			}else if (number == 6) {
				System.out.println("Saturday");
			}else {
				System.out.println("Sunday");
			}
			
		}else {
			System.out.println("Input is out of range, please enter number from 1 to 7");
		}
		
		
		
		Scanner.close();
		

	}

}
