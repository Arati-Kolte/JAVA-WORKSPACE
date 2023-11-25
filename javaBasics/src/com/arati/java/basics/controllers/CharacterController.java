
/**
 * 
 */
package com.arati.java.basics.controllers;

//import the scanner class
import java.util.Scanner;

import com.arati.java.basics.service.ArithmaticOperations;
import com.arati.java.basics.service.SwappingOperation;

/**
 * @author ARATI-KOLTE
 */
//create a class characercontroller

public class CharacterController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a char variable
		
		char num1, num2;
		
		//Object for InputsBean
		
		Scanner scanner = new Scanner(System.in);
		
		//object for arithmetic operation
		
		ArithmaticOperations addition = new ArithmaticOperations();
		
		//object for swapping operation
		
		SwappingOperation swap = new SwappingOperation();
		
	 
		
		System.out.println("Enter a Character :");
		
		num1 = scanner.next().charAt(0);
		
		System.out.println("Enter a Character :");
		
		num2 = scanner.next().charAt(0);
		
		addition.additionDemo(num1, num2);
		
		System.out.println("");
		System.out.println("");
		
		swap.swappingDemo(num1, num2);
		
		scanner.close();
		

	}

}
