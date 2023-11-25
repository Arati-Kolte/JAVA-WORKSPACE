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
public class IntegerController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		//Object for InputsBean
		Scanner scanner = new Scanner(System.in);
		
		ArithmaticOperations operation = new ArithmaticOperations();
		
		SwappingOperation swap = new SwappingOperation();
		
		System.out.println("Ener a number :");
		
		num1 = scanner.nextInt();
		
		System.out.println("Ener a number :");
		
		num2 = scanner.nextInt();
		
		operation.additionDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		operation.substractionDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		operation.multiplicationDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		operation.divisionDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		swap.swappingDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		swap.swappingDemoWithoutHelp(num1, num2);
		
		scanner.close();
		

	}

}
