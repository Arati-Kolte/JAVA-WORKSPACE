/**
 * 
 */
package com.arati.java.basics.ifelseexc;

/**
 * @author ARATI-KOLTE
 */
public class SmallestNumber {
	
	public void findSmallestNumber(double num1, double num2, double num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.println("The number (" + num1 + ") smallest");
		}else if (num2 < num1 && num2 < num3) {
			System.out.println("The number (" + num2 + ") smallest");
		}else {
			System.out.println("The number (" + num3 + ") smallest");
			
		}
	}


}
