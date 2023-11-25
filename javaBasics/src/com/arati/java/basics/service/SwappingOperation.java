/**
 * 
 */
package com.arati.java.basics.service;

/**
 * @author ARATI-KOLTE
 */
public class SwappingOperation {
	
	public void swappingDemo(int num1, int num2) {
		
		int temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);		
	}
	
	public void swappingDemo(double num1, double num2) {
		
		double temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);		
	}
	
    public void swappingDemo(char num1, char num2) {
		
    	char temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);		
	}
    
    public void swappingDemo(String num1, String num2) {
		
    	String temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);		
	}
    
   public void swappingDemoWithoutHelp(int num1, int num2) {		
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);		
	}
	
   	public void swappingDemoWithoutHelp(double num1, double num2) {		
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Num1: " + num1 +" Num2 : " + num2);		
	}
}
