/**
 * 
 */
package com.arati.java.basics.controllers;

import java.util.Scanner;

import com.arati.java.basics.service.ArithmaticOperations;
import com.arati.java.basics.service.SwappingOperation;

/**
 * @author ARATI-KOLTE
 */
public class StringController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1, num2;
		
		//Object for InputsBean
		Scanner scanner = new Scanner(System.in);
		
		ArithmaticOperations addition = new ArithmaticOperations();
		
		SwappingOperation swap = new SwappingOperation();
		
		System.out.println("Ener a String :");
		
		num1 = scanner.nextLine();
		
		System.out.println("Ener a String :");
		
		num2 = scanner.nextLine();
		
		addition.additionDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		swap.swappingDemo(num1, num2);
		
		scanner.close();
		

	}

}
