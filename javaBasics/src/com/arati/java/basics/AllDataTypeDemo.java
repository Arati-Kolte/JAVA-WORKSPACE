/**
 * 
 */
package com.arati.java.basics;

/**
 * @author ARATI-KOLTE
 */
public class AllDataTypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte b = 5; 
		System.out.println("b - " + b);
		// 1 byte - 8 bits  (-128 to 127)
		
		
		short s = 5;
		System.out.println("s - " + s);
		//2 byte - 16 bits  (-32,768 to 32,767)
		
		int i = 5;  
		System.out.println("i - " + i);
		//4 byte - 32 bits   (-2,147,483,648 to 2,147,483,647)
		
		long l = 5l;   // 5l here L is species that whatever you have assign here long typed value
		System.out.println("l - " + l);
		//8 byte - 64 bits   (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		
		char ch1,ch2;
		ch1 ='y';
		ch2 = 88;
		System.out.println("value of variables ch1 and ch2 - " + ch1 + " and " + ch2 );
		
		boolean b1 = true;  //true
		boolean b2 = false;  //false
		boolean b3 = 2 < 3;  //true
		boolean b4 = 2 > 3;  //false
		System.out.println(b1);

	
		float f = 5.5F;
		System.out.println("value of f - " + f );
		System.out.println("sum of variable f - " + ( f + f ));
		
		
		double d = 5.5d;
		System.out.println("value of variable d - " + d);
		System.out.println("sum of variable d - " + ( d + d ));
		
		
		
		
		
	}

}
