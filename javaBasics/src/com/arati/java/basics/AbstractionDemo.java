/**
 * 
 */
package com.arati.java.basics;

/**
 * @author ARATI-KOLTE
 */

abstract class car {
	abstract void run();

}

class Waganr extends car {
	public void run()

	{

		System.out.println("Waganr car is running");

	}
}

public class AbstractionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waganr w = new Waganr();
		w.run();

	}

}
