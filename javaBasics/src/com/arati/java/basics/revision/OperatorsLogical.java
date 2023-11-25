/**
 * 
 */
package com.arati.java.basics.revision;

/**
 * @author ARATI-KOLTE
 */
public class OperatorsLogical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 6;
		int a = 7;
		int b = 8;
		//And (&&) operator
		//combination
		//true true - true
		boolean result1 = x < y && a < b;
		//true false -false
		boolean result2 = x < y && a > b;
		//false true - false
		boolean result3 = x > y && a < b;
		//false false - false
		boolean result4 = x > y && a > b;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//or (||) operator
				
				//true true - true
				boolean result5 = x < y || a < b;
				//true false -true
				boolean result6 = x < y || a > b;
				//false true - true
				boolean result7 = x > y || a < b;
				//false false - false
				boolean result8 = x > y || a > b;
				System.out.println(result5);
				System.out.println(result6);
				System.out.println(result7);
				System.out.println(result8);
				
		//Not (!)operator
				//true - false
				//false - true
		
		
		
		
				

	}

}
