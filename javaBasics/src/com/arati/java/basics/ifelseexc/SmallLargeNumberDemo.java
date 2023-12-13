/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class SmallLargeNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number :");
		float number = scr.nextFloat();
		
		if(number > 0) {
			if (number < 1)
            {
                System.out.println("Positive small number");
            }
            else if (number > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
			
		}else if(number < 0){
			if (Math.abs(number) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(number) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
			
		}else {
			System.out.println("Zero");
		}

	}

}
