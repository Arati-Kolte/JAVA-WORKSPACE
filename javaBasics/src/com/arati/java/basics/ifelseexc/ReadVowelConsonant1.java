/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class ReadVowelConsonant1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character :");
		// char chr = scanner.next().charAt(0);
		String str = scanner.nextLine();

		if (str.length() > 1) {
			System.out.println("Invalid input");
		} else {
			char chr = str.charAt(0);
			if ((chr >= 'A' && chr <= 'Z') || (chr >= 'a' && chr <= 'z')) {
				if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
					System.out.println("Vowel");
				} else if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
					System.out.println("Vowel");
				} else {
					System.out.println("Consonant");
				}

			} else {
				System.out.println("Invalid input");
			}

		}

	}

}
