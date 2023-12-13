/**
 * 
 */
package com.arati.java.basics.forloop;

import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class PrintLettersAtoZForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a character");
	
	//printing alphabets A to Z
	char c;
	for(c='A';c<='Z';c++) {
		System.out.print(c + " , ");
		
	}
	System.out.println(" ");
	
	//printing alphabets decreasing order
	for(c = 'Z'; c >= 'A' ; c--) {
		System.out.print(c + " , ");
	}
	
	
	
	
	}
}


