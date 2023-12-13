/**
 * 
 */
package com.arati.java.basics.array;

/**
 * @author ARATI-KOLTE
 */
public class ArrayExerciseFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num[] = {6,3,8,5};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		//if you want to change value 8 by 2
		num[8]=2;
		
		//if we dont  want to set the value
		//in this the value of all this array will be 0
		//(0,0,0,,0,0)=(0,1,2,3,4)
		int number[] = new int[5];
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		

	}

}
