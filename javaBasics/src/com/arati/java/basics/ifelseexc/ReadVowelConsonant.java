/**
 * 
 */
package com.arati.java.basics.ifelseexc;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class ReadVowelConsonant {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		ReadVowelConsonant vowelConsonant = new ReadVowelConsonant();//created obj of class ReadVowelConsonant
		Scanner scanner = new Scanner(System.in); //created scanner obj for read input
		
		System.out.println("Enter a character"); //println method for write input on console
		
		String str = scanner.nextLine();//to read whole line

		vowelConsonant.checkString(str);//
		
		vowelConsonant.checkStringAnother(str);

		scanner.close();
	}

	public void checkString(String str) {
		System.out.println("");

		if (str.length() > 1) {
			System.out.println("Invalid Input");
		} else {
			char ch = str.charAt(0);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.println("Vowel");
				} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					System.out.println("Vowel");
				} else {
					System.out.println("Consonant");
				}
			} else {
				System.out.println("Invalid Input");
			}
			System.out.println("");
		}
	}
	

	public void checkStringAnother(String str) {
		System.out.println("");

		if (!(str.length() > 1)) {
			char ch = str.charAt(0);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				
				System.out.println("");

				if (ch == 'a' || ch == 'A') {
					System.out.println("Vowel");
				} else if (ch == 'e' || ch == 'E') {
					System.out.println("Vowel");
				} else if (ch == 'i' || ch == 'I') {
					System.out.println("Vowel");
				} else if (ch == 'o' || ch == 'O') {
					System.out.println("Vowel");
				} else if (ch == 'u' || ch == 'U') {
					System.out.println("Vowel");
				} else {
					System.out.println("Consonant");
				}
			} else {
				System.out.println("Invalid Input");
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

	

}
