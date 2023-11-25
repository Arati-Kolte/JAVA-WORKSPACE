/**
 * 
 */
package com.arati.java.basics.revision;

/**
 * @author ARATI-KOLTE
 */
public class Variables1Demo {
	int a = 100;//instance variables
	
	static int c = 300;//static variables
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int b = 200;//local variables
		
		Variables1Demo obj = new Variables1Demo();
		System.out.println("instance variables :"+(obj.a));
		System.out.println("local variables :"+ b);
		System.out.println("static variables :"+c);
		
		
		
		

	}

}
