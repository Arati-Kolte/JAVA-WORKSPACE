/**
 * 
 */
package com.arati.java.basics.cj;

/**
 * @author ARATI-KOLTE
 */
public class ReadWriteDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create an Object for ReadwriteOperations		
		ReadwriteOperations operations = new ReadwriteOperations();
		
		//Perform operations for integer values.
		operations.readWriteInt();
		
		//Perform operations for double values.
		operations.readWriteDouble();
		
		//Perform operations for Character values.
		operations.readWriteCharValue();
		
		//Perform operations for String values.
		operations.readWriteStringValue();
		

	}

}
