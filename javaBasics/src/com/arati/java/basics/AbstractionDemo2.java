/**
 * 
 */
package com.arati.java.basics;

/**
 * @author ARATI-KOLTE
 */


abstract class mobile{
abstract void show();

}

class samsung extends mobile{
	public void show()
	{
		System.out.println("mobile is showing the pictures");
	}
	

}

public class AbstractionDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile m = new samsung();
		m.show();
		
		

	}

}
