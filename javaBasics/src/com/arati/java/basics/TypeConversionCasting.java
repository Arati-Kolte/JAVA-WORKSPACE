/**
 * 
 */
package com.arati.java.basics;

/**
 * @author ARATI-KOLTE
 */
public class TypeConversionCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
	  byte b = 127;
	  
	  System.out.println(b);
	  
	//  byte b1 = 128;    //will show error because byte max value is 127
	  
	//  System.out.println (b1);
	  
	  //type conversion implicit..widening the value
	   int n = b;
	  
	  
	  System.out.println(n);
	  
	   int n1 = 15;
	  
	 // byte b1 = n1;     error occers bcoz you cant assign int to byte format
	  
	  byte b1 = (byte)n1;
	  System.out.println(b1);
	  
	  //float to int  type casting narrowing the value
	  float f = 5.3f;
	  int t = (int)f;
	  // t = 5  (.3 will loss)
	  System.out.println(t);  //error occurs int cant convert to float,if float 5.3 converts into int it 
	                          //result get only 5.  (.3) will be loss(chances of data lossing
	  
	  
	  //type pramotion
	  
	  byte a = 10;
	  byte a1 = 30;
	 // byte a3 = a * a1;   //Error bcoz a * a1 =300...and byte max value is 127
	  
	  int result = a * a1;  //byte to int
	  System.out.println(result);  
	  
 
	  
	  
	  
		

	}

}
