/**
 * 
 */
package com.arati.java.basics.whileloop;

/**
 * @author ARATI-KOLTE
 */
public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 1;
		while (i <=6) {
			int j = 1;
			while(j <=i) {
				System.out.println("*");
				j++;
			}
			System.out.println("");
			i++;
		}
		

	}

}
