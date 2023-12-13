/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class ReadFloatCheckDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "";
		String str2 = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double number1 = scanner.nextDouble();
		System.out.println("Enter second number");
		double number2 = scanner.nextDouble();

		str1 = "" + number1;

		str2 = "" + number2;

		str1 = str1.substring(str1.indexOf("."));

		if (str1.length() > 3) {
			str1 = str1.substring(1, 4);
		}

		str2 = str2.substring(str2.indexOf("."));

		if (str2.length() > 3) {
			str2 = str2.substring(1, 4);
		}

		number1 = Double.parseDouble(str1);

		number2 = Double.parseDouble(str2);

		if (number1 == number2) {
			System.out.println("They are the same up to three decimal places");
		} else {
			System.out.println("They are different");
		}

		scanner.close();

	}

}
