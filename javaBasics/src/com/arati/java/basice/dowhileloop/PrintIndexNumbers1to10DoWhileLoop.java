/**
 * 
 */
package com.arati.java.basice.dowhileloop;

/**
 * @author ARATI-KOLTE
 */
public class PrintIndexNumbers1to10DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//print Index Numbers 0 to 10
		//initilization
		int i = 0;
		
		//do print the block of code till the condition is true
		do {
			System.out.print(i + " , ");
			i++;
		}while(i <= 10); //condition
		
		System.out.print(" . ");
		System.out.println(" ");
		
	//Index Number 10 to 0
		int n = 10;
	do {
		System.out.print(n + " , ");
		n--;
	}while(n >= 0);
	
	
	}
}
