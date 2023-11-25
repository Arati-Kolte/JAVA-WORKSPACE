/**
 * 
 */
package com.arati.java.basics;

//import the scanner class
import java.util.Scanner;

/**
 * @author ARATI-KOLTE
 */
public class InputString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a scanner object
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter username: ");
		
		//read user input
		String username = obj.nextLine();
		
		System.out.println("username is: " + username);
		
		
		

	}

}
