/**
 * 
 */
package com.arati.java.basics;

/**
 * @author ARATI-KOLTE
 */
public class AdditionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =10;
		int number1 =20;
	
		System.out.println("Sum of " + number + " and " + number1 + " = " + (number + number1));
		
		int sum = number + number1;
		
		System.out.println("Sum of " + number + " and " + number1 + " = " + sum);
		
		double number2, number3;
		
		number2 = 30.57;
		
		number3 = 6895.30;
		
		System.out.println("Sum of " + number2 + " and " + number3 + " = " + (number2 + number3));
		
		double number4 = number2 + number3;
		
		System.out.println("Sum of " + number2 + " and " + number3 + " = " + number4);
		
		int number5 = (int) (number2 + number3);
		
		System.out.println("Sum of " + number2 + " and " + number3 + " = " + number5);
		
		
		double number6 = number2 + number;
		
		System.out.println("Sum of " + number2 + " and " + number + " = " + number6);
		
		int number7 = (int) (number2 + number);
		
		System.out.println("Sum of " + number2 + " and " + number + " = " + number7);
		
		

	}

}
