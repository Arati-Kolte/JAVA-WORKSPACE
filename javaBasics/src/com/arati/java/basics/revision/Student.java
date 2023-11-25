/**
 * 
 */
package com.arati.java.basics.revision;

/**
 * @author ARATI-KOLTE
 * @param <string>
 */
public class Student {
	
	int x = 2000; 
	
	int y = 1000;
	int z = x + y;
	byte b = 127;
	short s =32_767;
	long l = 123_456_7890;
	//demo for float and double variables
	
	float f = 3.5555555555555f;
	double d = 32.555555555555555555d;
	
	//to get minium and maxium value
	int minvalue = Integer.MIN_VALUE;
	int maxvalue = Integer.MAX_VALUE;
	byte minv = Byte.MIN_VALUE;
	byte maxv= Byte.MAX_VALUE;
	short minv1 = Short.MIN_VALUE;
	short maxv1 = Short.MAX_VALUE;
	long minv2 = Long.MIN_VALUE;
	long maxv2 = Long.MAX_VALUE;
	
	

	//creating a compute method
	void compute () {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("value of z is : " + (x + y ));
		System.out.println("value of L is : " + l);
	    System.out.println("min value of integer : " + minvalue);
	    System.out.println("max value of integer : " + maxvalue);
	    System.out.println("min value of byte : " + minv);
	    System.out.println("max value of byte : " + maxv);
	    System.out.println("min value of short : " + minv1);
	    System.out.println("max value of short : " + maxv1);
	    System.out.println("min value of long : " + minv2);
	    System.out.println("max value of long : " + maxv2);
	    System.out.println(f);
	    System.out.println(d);
		
		
		
		
	}
	public static void main(String[] args) {
		
		
		Student s = new Student();
		//invokeing/calling the compute method in main method
		s.compute();
	
	

	
	 
	 
	

	}

}
