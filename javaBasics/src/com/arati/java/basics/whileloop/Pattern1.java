/**
 * 
 */
package com.arati.java.basics.whileloop;

/**
 * @author ARATI-KOLTE
 */
public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while (i <= 6) {
			
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}
